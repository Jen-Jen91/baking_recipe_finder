import React from 'react';
import Ingredient from './Ingredient.js';

const IngredientList = (props) => {

  const ingredients = props.ingredients.map((ingredient) => {
    return(
      <li key={ingredient.id}>
        <Ingredient ingredient={ingredient} />
      </li>
    );
  });

  return(
    <ul>
      {ingredients}
    </ul>
  );

}

export default IngredientList;
