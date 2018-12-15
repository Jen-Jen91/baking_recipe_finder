import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import NavBar from './NavBar.js';

import Home from './Home.js';
import RecipeListContainer from './containers/recipes/RecipeListContainer.js';
import IngredientListContainer from './containers/ingredients/IngredientListContainer.js';

import SingleRecipeContainer from './containers/recipes/SingleRecipeContainer.js';
import SingleIngredientContainer from './containers/ingredients/SingleIngredientContainer.js';

class App extends Component {
  render() {
    return (
      <Router>
        <React.Fragment>
          <NavBar />
          <Switch>
            <Route exact path="/" component={Home}/>
            <Route exact path="/recipes" component={RecipeListContainer}/>
            <Route exact path="/ingredients" component={IngredientListContainer}/>
            <Route exact path="/recipes/:id"
              render = {(props) => {
                const id = props.match.params.id;
                return <SingleRecipeContainer id = {id}/>
              }}
            />
            <Route exact path="/ingredients/:id"
              render = {(props) => {
                const id = props.match.params.id;
                return <SingleIngredientContainer id = {id}/>
              }}
            />
          </Switch>
        </React.Fragment>
      </Router>
    );
  }
}

export default App;
