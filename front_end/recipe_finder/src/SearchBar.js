import React, {Component, Fragment} from 'react';
import Request from './helpers/request.js';
import RecipeList from './components/recipes/RecipeList.js';

class SearchBarContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {
      ingredients: [],
      selectedIngredients: [],
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
    this.setState({selectedIngredients: event.target.value});
  }

  handleSubmit(event) {
    event.preventDefault();
    const ids = this.checkIngredients(this.state.selectedIngredients);
    if (!ids) {
      return null;
    }

    let request = new Request();
    var recipeData = [];

    ids.forEach((id) => {
      request.get('/ingredients/' + id + '/recipes')
        .then((data) => {
          data._embedded.recipes.forEach((item) => {
            recipeData.forEach((recipe, index) => {
              if (recipe.name === item.name) {
                recipeData.splice(index, 1);
              }
            });
            recipeData.push(item);
            this.setState({recipes: recipeData});
          });
        });
    });
  }

  checkIngredients(ingredient) {
    let ids = [];
    this.state.ingredients.forEach((item) => {
      if (ingredient.includes(item.name) || item.name.includes(ingredient)) {
        ids.push(item.id);
      }
    });
    return ids;
  }

  render() {
    return(
      <Fragment>
        <form>
          <input
            type="text"
            placeholder="Add your ingredients..."
            value={this.state.selectedIngredients}
            onChange={this.handleSearch}
          />
          <button onClick={this.handleSubmit}>Search</button>
        </form>
        <RecipeList recipes={this.state.recipes}/>
      </Fragment>
    );
  }

}

export default SearchBarContainer;
