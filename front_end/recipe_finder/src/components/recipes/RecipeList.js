import React from 'react';
import Recipe from './Recipe.js';

const RecipeList = (props) => {

  const recipes = props.recipes.map((recipe) => {
    return(
      <li key={recipe.id}>
        <Recipe recipe={recipe} />
      </li>
    );
  });

  return(
    <ul>
      {recipes}
    </ul>
  );

}

export default RecipeList;
