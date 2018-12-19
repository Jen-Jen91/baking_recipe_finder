import React, {Component, Fragment} from 'react';
import RecipeDetails from '../../components/recipes/RecipeDetails.js';
import Request from '../../helpers/request.js';

class SingleRecipeContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {recipe: null}
    this.handleSave = this.handleSave.bind(this);
    this.handleUnsave = this.handleUnsave.bind(this);
  }

  componentDidMount() {
    let request = new Request();
    request.get('/recipes/' + this.props.id)
      .then((data) => {
        this.setState({recipe: data})
      });
  }

  handleSave() {
    console.log("recipe", this.state.recipe);
    let request = new Request();
    request.post('/savedRecipes', this.state.recipe)
      .then(() => {
        // const button = document.getElementsByClassName("save-button");
        // button.disabled = true;
      });
  }

  handleUnsave() {
    let request = new Request();
    request.delete('/savedRecipes/' + this.props.id)
      .then((data) => {
        const button = document.getElementsByClassName("save-button");
        button.disabled = true;
      });
  }

  render() {
    if(!this.state.recipe) {
      return null;
    }

    return(
      <Fragment>
        <h3>{this.state.recipe.name}</h3>
        <button className="save-button" onClick={this.handleSave}>Save</button>
        <button className="unsave-button" onClick={this.handleUnsave}>Unsave</button>
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
