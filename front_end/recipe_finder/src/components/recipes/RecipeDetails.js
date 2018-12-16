import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const RecipeDetails = (props) => {

  if(!props.ingredients) {
    return null;
  }

  const ingredients = props.ingredients.map((ingredient) => {
    return <li key={ingredient.id}>
      <Link to={'/ingredients/' + ingredient.id}>{ingredient.name}</Link>
    </li>
  });

  return(
    <Fragment>
      <p>Total Time: {props.recipe.time} minutes</p>
      <ul>{ingredients}</ul>
      <p>{props.recipe.instructions}</p>
    </Fragment>
  );

}

// TODO: <img src={props.recipe.image_url} alt={props.recipe.name}/>

export default RecipeDetails;
