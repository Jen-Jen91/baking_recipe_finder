import React, {Component, Fragment} from 'react';
import SearchBar from '../components/SearchBar.js';
import Request from '../helpers/request.js';
import RecipeList from '../components/recipes/RecipeList.js';

class SearchBarContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {
      ingredients: [],
      recipes: []
    }
    this.handleSearch = this.handleSearch.bind(this);
  }

  componentDidMount() {
    let request = new Request();
    request.get('/ingredients')
      .then((data) => {
        this.setState({ingredients: data._embedded.ingredients})
      });
  }

  handleSearch() {
    console.log("!handleSearch activated!");
    let request = new Request();
    request.get('/recipes')
      .then((data) => {
        this.setState({recipes: data._embedded.recipes})
      });
  }

  render() {
    return(
      <Fragment>
        <h3>SearchBarContainer</h3>
        <SearchBar
          ingredients={this.state.ingredients}
          handleSearch={this.handleSearch}
        />
        <RecipeList recipes={this.state.recipes} />
      </Fragment>
    );
  }
}

export default SearchBarContainer;
