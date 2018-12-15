import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Ingredient = (props) => {

  if(!props.ingredient) {
    return null;
  }

  return(
    <Fragment>
      <Link to={"/ingredients/" + props.ingredient.id}>
        {props.ingredient.name}
      </Link>
    </Fragment>
  );

}

export default Ingredient;
