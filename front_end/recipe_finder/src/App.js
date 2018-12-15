import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from './NavBar.js';
import Home from './Home.js';
import RecipeListContainer from './containers/recipes/RecipeListContainer.js';
import IngredientListContainer from './containers/ingredients/IngredientListContainer.js';

class App extends Component {
  render() {
    return (
      <Router>
        <React.Fragment>
          <NavBar />
          <h1>Recipe Finder App</h1>
          <Switch>
            <Route exact path="/" component={Home}/>
            <Route path="/recipes" component={RecipeListContainer}/>
            <Route path="/ingredients" component={IngredientListContainer}/>
          </Switch>
        </React.Fragment>
      </Router>
    );
  }
}

export default App;
