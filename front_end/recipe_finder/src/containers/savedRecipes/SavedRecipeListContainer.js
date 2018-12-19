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
    request.get('/savedRecipes')
      .then((data) => {
        this.setState({savedRecipes: data._embedded.savedRecipes})
      });
  }

  render() {
    return(
      <SavedRecipeList savedRecipes={this.state.savedRecipes} />
    );
  }

}

export default SavedRecipeListContainer;
