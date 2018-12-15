import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return (
    <header>
      <ul>
        <li className="navLink"><Link to="/">Home</Link></li>
        <li className="navLink"><Link to="/recipes">Recipes</Link></li>
        <li className="navLink"><Link to="/ingredients">Ingredients</Link></li>
      </ul>
    </header>
  );
}

export default NavBar;
