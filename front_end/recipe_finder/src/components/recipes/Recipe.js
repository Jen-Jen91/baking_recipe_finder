import React, {Fragment} from 'react';

const Recipe = (props) => {

  if(!props.recipe) {
    return null;
  }

  return(
    <Fragment>
      <h3>{props.recipe.name}</h3>
      <p>{props.recipe.time}</p>
      <p>{props.recipe.instructions}</p>
      <img src={props.recipe.image_url} alt={props.recipe.name}/>
    </Fragment>
  )


}

export default Recipe;
