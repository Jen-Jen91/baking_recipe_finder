import React, {Component, Fragment} from 'react';
import SearchBar from '../components/SearchBar.js';

class SearchBarContainer extends Component {
  render() {
    return(
      <Fragment>
        <h3>SearchBarContainer</h3>
        <SearchBar />
      </Fragment>
    );
  }
}

export default SearchBarContainer;
