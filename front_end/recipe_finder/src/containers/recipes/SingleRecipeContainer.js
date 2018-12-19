import React, {Component, Fragment} from 'react';
import RecipeDetails from '../../components/recipes/RecipeDetails.js';
import Request from '../../helpers/request.js';

class SingleRecipeContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {recipe: null}
    this.handleSave = this.handleSave.bind(this);
    this.handleUnsave = this.handleUnsave.bind(this);
    this.patchFavourite = this.patchFavourite.bind(this);
  }

  componentDidMount() {
    let request = new Request();
    request.get('/recipes/' + this.props.id)
      .then((data) => {
        this.setState({recipe: data})
      });
  }

  handleSave() {
    let recipeCopy = JSON.parse(JSON.stringify(this.state.recipe));
    if (this.state.recipe.favourite === false) {
      recipeCopy.favourite = true;
      this.setState({recipe: recipeCopy}, () => this.patchFavourite());
      document.getElementById("save-button").disabled = true;
      document.getElementById("unsave-button").disabled = false;
    }
  }

  handleUnsave() {
    let recipeCopy = JSON.parse(JSON.stringify(this.state.recipe));
    if (this.state.recipe.favourite === true) {
      recipeCopy.favourite = false;
      document.getElementById("unsave-button").disabled = true;
      document.getElementById("save-button").disabled = false;
      this.setState({recipe: recipeCopy}, () => this.patchFavourite());
    }
  }

  patchFavourite() {
    let request = new Request();
    request.patch('/recipes/' + this.props.id, this.state.recipe)
      .then(() => {});
  }

  render() {
    if(!this.state.recipe) {
      return null;
    }

    return(
      <Fragment>
        <h2 className="recipe-name">{this.state.recipe.name}</h2>
        <button id="save-button" onClick={this.handleSave}>Add To Favourites</button>
        <button id="unsave-button" onClick={this.handleUnsave}>Remove From Favourites</button>
        <RecipeDetails
          recipe={this.state.recipe}
          ingredients={this.state.recipe._embedded.ingredients}
          instructions={this.state.recipe.instructions}
        />
      </Fragment>
    );
  }

}

export default SingleRecipeContainer;
