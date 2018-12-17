import React, {Component, Fragment} from 'react';
import Request from '../helpers/request.js';
import RecipeList from '../components/recipes/RecipeList.js';

class SearchBarContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {
      ingredients: [],
      selectedIngredient: "",
      recipes: []
    }
    this.handleSearch = this.handleSearch.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.checkIngredients = this.checkIngredients.bind(this);
  }

  componentDidMount() {
    let request = new Request();
    request.get('/ingredients')
      .then((data) => {
        this.setState({ingredients: data._embedded.ingredients})
      });
  }

  handleSearch(event) {
    this.setState({selectedIngredient: event.target.value});
  }

  handleSubmit(event) {
    event.preventDefault();
    const id = this.checkIngredients(this.state.selectedIngredient);
    let request = new Request();
    request.get('/ingredients/' + id + '/recipes')
      .then((data) => {
        this.setState({recipes: data._embedded.recipes})
      });
    console.log("recipes", this.state.recipes);
  }

  checkIngredients(ingredient) {
    let id = null;
    this.state.ingredients.forEach((item) => {
      if (item.name === ingredient) {
        id = item.id;
      }
    });
    return id;
  }

  render() {
    return(
      <Fragment>
        <h3>SearchBarContainer</h3>
        <form>
          <input
            type="text"
            placeholder="Add your ingredients..."
            value={this.state.selectedIngredient}
            onChange={this.handleSearch}
          />
          <button onClick={this.handleSubmit}>Search</button>
        </form>
        <RecipeList recipes={this.state.recipes} />
      </Fragment>
    );
  }

}

export default SearchBarContainer;
