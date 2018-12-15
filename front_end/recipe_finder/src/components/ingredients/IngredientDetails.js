import React from 'react';

const IngredientDetails = (props) => {

  if(!props.recipes) {
    return null;
  }

  const recipes = props.recipes.map((recipe) => {
    return <li key={recipe.id}>{recipe.name}</li>
  });

  return(
    <ul>{recipes}</ul>
  );

}

export default IngredientDetails;
