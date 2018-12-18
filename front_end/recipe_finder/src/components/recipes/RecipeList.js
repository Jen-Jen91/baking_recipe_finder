import React from 'react';
import Recipe from './Recipe.js';

const RecipeList = (props) => {

  const recipes = props.recipes.map((recipe, index) => {
    return(
      <li key={index}>
        <Recipe recipe={recipe}/>
      </li>
    );
  });

  return(
    <ul className="recipe-list">
      {recipes}
    </ul>
  );

}

export default RecipeList;
