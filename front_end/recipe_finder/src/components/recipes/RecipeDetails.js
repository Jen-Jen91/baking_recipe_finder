import React from 'react';
import {Link} from 'react-router-dom';

const RecipeDetails = (props) => {

  if(!props.ingredients) {
    return null;
  }

  const ingredients = props.ingredients.map((ingredient) => {
    return <li key={ingredient.id}>
      <Link className="recipe-ingredient-link" to={'/ingredients/' + ingredient.id}>{ingredient.name}</Link>
    </li>
  });

  const fullInstructions = props.instructions.split("+");

  const ingredientDetails = fullInstructions[0].split(":");
  const ingredientList = ingredientDetails.map((ingredient, index) => {
    return <li key={index}>{ingredient}</li>
  });

  const directions = fullInstructions[1].split(":");
  const directionList = directions.map((direction, index) => {
    return <li key={index}>{direction}</li>
  });

  return(
    <div className="recipe-details-div">
      <p>Total Time: {props.recipe.time} minutes</p>
      <p>Ingredients:</p>
      <ul>{ingredients}</ul>
      <img src={props.recipe.image_url} alt={props.recipe.name} width="200" height="200"/>
      <div className="instructions">
        <h3>Method</h3>
        <ul>{ingredientList}</ul>
        <ol className="directions">{directionList}</ol>
      </div>
    </div>
  );

}

export default RecipeDetails;
