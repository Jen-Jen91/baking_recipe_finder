import React from 'react';
import {Link} from 'react-router-dom';

const IngredientDetails = (props) => {

  if(!props.recipes) {
    return null;
  }

  const recipes = props.recipes.map((recipe) => {
    return <li key={recipe.id}>
      <Link className="ingredient-details-recipe-link" to={'/recipes/' + recipe.id}>{recipe.name}</Link>
    </li>
  });

  return(
    <ul>{recipes}</ul>
  );

}

export default IngredientDetails;
