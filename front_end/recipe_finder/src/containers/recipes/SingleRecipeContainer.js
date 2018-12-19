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
    let recipeCopy = JSON.parse(JSON.stringify(this.state.recipe));

    if (this.state.recipe.favourite === false) {
      recipeCopy.favourite = true;
      console.log("SAVE", recipeCopy);
      document.getElementById("save-button").disabled = true;
      this.setState({recipe: recipeCopy});
    }

    // this.setState({recipe: recipeCopy});

    let request = new Request();
    request.patch('/recipes/' + this.props.id, this.state.recipe)
      .then(() => {
        console.log("SAVE2", this.state.recipe);
        // document.getElementById("save-button").disabled = true;
      });
  }

  handleUnsave() {
    let recipeCopy = JSON.parse(JSON.stringify(this.state.recipe));

    if (this.state.recipe.favourite === true) {
      recipeCopy.favourite = false;
      console.log("UNSAVE", recipeCopy);
      document.getElementById("unsave-button").disabled = true;
      this.setState({recipe: recipeCopy});
    }

    // this.setState({recipe: recipeCopy});

    let request = new Request();
    request.patch('/recipes/' + this.props.id, this.state.recipe)
      .then(() => {
        console.log("UNSAVE2", this.state.recipe);
        // document.getElementById("unsave-button").disabled = true;
      });
  }

  render() {
    if(!this.state.recipe) {
      return null;
    }

    return(
      <Fragment>
        <h3>{this.state.recipe.name}</h3>
        <button id="save-button" onClick={this.handleSave}>Save</button>
        <button id="unsave-button" onClick={this.handleUnsave}>Unsave</button>
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
