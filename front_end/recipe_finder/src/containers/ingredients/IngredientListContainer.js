import React, {Component} from 'react';
import IngredientList from '../../components/ingredients/IngredientList.js';
import Request from '../../helpers/request.js';

class IngredientListContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {ingredients: []}
  }

  componentDidMount() {
    let request = new Request();
    request.get('/ingredients')
      .then((data) => {
        this.setState({ingredients: data._embedded.ingredients})
      });
  }

  render() {
    return(
      <IngredientList ingredients={this.state.ingredients} />
    );
  }

}

export default IngredientListContainer;
