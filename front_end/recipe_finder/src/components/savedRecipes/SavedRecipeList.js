import React from 'react';
import Recipe from '../recipes/Recipe.js';

const SavedRecipeList = (props) => {

  if(!props.savedRecipes) {
    return null;
  }

  const savedRecipes = props.savedRecipes.map((recipe, index) => {
    return(
      <li key={index}>
        <Recipe recipe={recipe}/>
      </li>
    );
  });

  return(
    <ul className="recipe-list">
      {savedRecipes}
    </ul>
  );

}

export default SavedRecipeList;
