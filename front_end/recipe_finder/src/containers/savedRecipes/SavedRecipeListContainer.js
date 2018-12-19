import React, {Component} from 'react';
import SavedRecipeList from '../../components/savedRecipes/SavedRecipeList.js';
import Request from '../../helpers/request.js';

class SavedRecipeListContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {savedRecipes: []}
  }

  componentDidMount() {
    let request = new Request();
    request.get('/recipes')
      .then((data) => {
        const savedRecipesOnly = data._embedded.recipes.filter((recipe) => {
          return recipe.favourite === true;
        });
        this.setState({savedRecipes: savedRecipesOnly})
      });
  }

  render() {
    return(
      <SavedRecipeList savedRecipes={this.state.savedRecipes} />
    );
  }

}

export default SavedRecipeListContainer;
