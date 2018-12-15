import React, {Component, Fragment} from 'react';
import SearchBarContainer from './containers/SearchBarContainer.js';

class Home extends Component {
  render() {
    return(
      <Fragment>
        <h1>Recipe Finder App - Homepage</h1>
        <SearchBarContainer />
      </Fragment>
    );
  }
}

export default Home;
