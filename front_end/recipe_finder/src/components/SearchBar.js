import React, {Fragment} from 'react';
import SearchField from 'react-search-field';

const SearchBar = (props) => {

  // const ingredients = props.ingredients.map((ingredient) => {
  //   return ingredient.name;
  // });



  return(
    <Fragment>
      <h3>SearchBar</h3>
      <SearchField
        placeholder="Add your ingredients..."
        onSearchClick={props.handleSearch}
      />
    </Fragment>
  );
}

export default SearchBar;
