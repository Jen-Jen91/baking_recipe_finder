import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Recipe = (props) => {

  if(!props.recipe) {
    return null;
  }

  return(
    <Fragment>
      <Link to={"/recipes/" + props.recipe.id}>
        <h3>{props.recipe.name}</h3>
      </Link>
      <p>Total Time: {props.recipe.time} mins</p>
      <p>{props.recipe.instructions}</p>

    </Fragment>
  );

}

// TODO: <img src={props.recipe.image_url} alt={props.recipe.name}/>

export default Recipe;
