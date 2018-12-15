import React, {Component} from 'react';
import RecipeList from '../../components/recipes/RecipeList.js';
import Request from '../../helpers/request.js';

class RecipeListContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {recipes: []}
  }

  componentDidMount() {
    let request = new Request();
    request.get('/recipes')
      .then((data) => {
        console.log("Data:", data);
        this.setState({recipes: data._embedded.recipes})
      });
  }

  render() {
    return(
      <RecipeList recipes={this.state.recipes} />
    );
  }

}

export default RecipeListContainer;
