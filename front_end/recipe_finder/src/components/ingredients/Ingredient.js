import React, {Fragment} from 'react';

const Ingredient = (props) => {

  if(!props.ingredient) {
    return null;
  }

  return(
    <Fragment>
      <p>{props.ingredient.name}</p>
    </Fragment>
  );

}

export default Ingredient;
