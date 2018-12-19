import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return (
    <header>
      <ul className="nav-list">
        <li className="nav-item">
          <Link to="/" className="nav-link">Home</Link>
        </li>
        <li className="nav-item">
          <Link to="/recipes" className="nav-link">Recipes</Link>
        </li>
        <li className="nav-item">
          <Link to="/ingredients" className="nav-link">Ingredients</Link>
        </li>
        <li className="nav-item">
          <Link to="/savedRecipes" className="nav-link">Favourite Recipes</Link>
        </li>
      </ul>
    </header>
  );
}

export default NavBar;
