import React, {Component, Fragment} from 'react';
import SearchBarContainer from './containers/SearchBarContainer.js';

class Home extends Component {
  render() {
    return(
      <Fragment>
        <h1 className="home-title">What's In The Cupboard?</h1>
        <SearchBarContainer />
      </Fragment>
    );
  }
}

export default Home;
