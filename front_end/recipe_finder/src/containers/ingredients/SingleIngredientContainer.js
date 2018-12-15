import React, {Component, Fragment} from 'react';
import IngredientDetails from '../../components/ingredients/IngredientDetails.js';
import Request from '../../helpers/request.js';

class SingleIngredientContainer extends Component {

  constructor(props) {
    super(props);
    this.state = {ingredient: null}
  }

  componentDidMount() {
    let request = new Request();
    request.get('/ingredients/' + this.props.id)
      .then((data) => {
        this.setState({ingredient: data})
      });
  }

  render() {
    if(!this.state.ingredient) {
      return null;
    }

    return(
      <Fragment>
        <h3>{this.state.ingredient.name}</h3>
        <IngredientDetails
          ingredient={this.state.ingredient}
          recipes={this.state.ingredient._embedded.recipes}
        />
      </Fragment>
    );
  }

}

export default SingleIngredientContainer;
