import React, {Component, Fragment} from 'react';
// import SearchBar from '../components/SearchBar.js';
// import SearchField from 'react-search-field';
import Request from '../helpers/request.js';
import RecipeList from '../components/recipes/RecipeList.js';


class SearchBarContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {
      ingredients: [],
      selectedIngredients: "",
      recipes: []
    }
    this.handleSearch = this.handleSearch.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.checkIngredients = this.checkIngredients.bind(this);
    this.checkRecipes = this.checkRecipes.bind(this);
  }

  componentDidMount() {
    let request = new Request();
    request.get('/ingredients')
      .then((data) => {
        this.setState({ingredients: data._embedded.ingredients})
      });
  }

  handleSearch(event) {
    console.log("event.target.value", event.target.value);
    this.setState({selectedIngredients: event.target.value});
    console.log("selectedIngredients", this.state.selectedIngredients);
  }

  checkIngredients(ingredient) {
    const ingredientNames = this.state.ingredients.map((item) => {
      return item.name;
    });
    if (!ingredientNames.includes(ingredient)) {
      return false;
    }
    return true
  }

  handleSubmit(event) {
    event.preventDefault();
    if (!this.checkIngredients(this.state.selectedIngredients)) {
      return null;
    }
    let request = new Request();
    request.get('/recipes')
      .then((data) => {
        this.setState({recipes: data._embedded.recipes})
      });
    console.log("recipes", this.state.recipes);
    this.checkRecipes(this.state.selectedIngredients);
  }

  checkRecipes(ingredient) {
  //   //For each recipe, get the list of ingredients
  //   //For each ingredient list, check if it includes 'ingredient'
  //   //If it does, return that recipe

      const selectedRecipes = this.state.recipes.map((recipe) => {
        console.log("recipe.ingredients", recipe.ingredients);

        const filteredRecipes = recipe.ingredients.map((item) => {
          console.log("item", item);
          if (!item.name === ingredient) {
            console.log("item.name", item.name);
            return recipe;
          }
          return null;
        })

        return filteredRecipes;
      })
      console.log("selectedRecipes", selectedRecipes);
  //   // this.setState({recipes: selectedRecipes});
  }

  render() {
    return(
      <Fragment>
        <h3>SearchBarContainer</h3>
        <form>
          <input
            type="text"
            placeholder="Add your ingredients..."
            value={this.state.selectedIngredients}
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
