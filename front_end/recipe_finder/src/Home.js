import React, {Component, Fragment} from 'react';
import SearchBar from './SearchBar.js';

class Home extends Component {
  render() {
    return(
      <Fragment>
        <div className="home-title-div">
          <h1 className="home-title">What's In The Cupboard?</h1>
        </div>
        <SearchBar />
      </Fragment>
    );
  }
}

export default Home;
