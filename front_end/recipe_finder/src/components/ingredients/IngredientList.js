import React from 'react';
import Ingredient from './Ingredient.js';

const IngredientList = (props) => {

  const ingredients = props.ingredients.map((ingredient) => {
    return(
      <li key={ingredient.id} className="ingredient-list-item">
        <Ingredient ingredient={ingredient} />
      </li>
    );
  });

  return(
    <ul className="ingredient-list">
        {ingredients}
    </ul>
  );

}

export default IngredientList;
