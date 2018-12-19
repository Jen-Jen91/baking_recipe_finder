import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Recipe = (props) => {

  if(!props.recipe) {
    return null;
  }

  const ingredients = props.recipe.ingredients.map((ingredient, index) => {
    return(
      <li key={index}>{ingredient.name}</li>
    );
  });

  return(
    <Fragment>
      <Link to={"/recipes/" + props.recipe.id}>
        <h3>{props.recipe.name}</h3>
      </Link>
      <Link to={"/recipes/" + props.recipe.id}>
        <img src={props.recipe.image_url} alt={props.recipe.name} width="200" height="200"/>
      </Link>
      <p>Total Time: {props.recipe.time} mins</p>
      <ul>{ingredients}</ul>

    </Fragment>
  );

}

// TODO: <img src={props.recipe.image_url} alt={props.recipe.name}/>

export default Recipe;
