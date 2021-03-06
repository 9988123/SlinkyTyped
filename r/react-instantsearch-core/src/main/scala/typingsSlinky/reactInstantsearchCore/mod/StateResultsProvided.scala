package typingsSlinky.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateResultsProvided[TDoc] extends js.Object {
  /** In case of multiple indices you can retrieve all the results */
  var allSearchResults: AllSearchResults[TDoc] = js.native
  /** If the search failed, the error will be logged here. */
  var error: AlgoliaError = js.native
  /** Flag that indicates if React InstantSearch has detected that searches are stalled. */
  var isSearchStalled: js.Any = js.native
  /**
    * The search results.
    * In case of multiple indices: if used under <Index>, results will be those of the corresponding index
    * otherwise it’ll be those of the root index
    */
  var searchResults: SearchResults[TDoc] = js.native
  /** The search state of the instant search component.  */
  var searchState: SearchState = js.native
  /** If there is a search in progress. */
  var searching: Boolean = js.native
  /** If there is a search in a list in progress. */
  var searchingForFacetValues: js.Any = js.native
}

object StateResultsProvided {
  @scala.inline
  def apply[TDoc](
    allSearchResults: AllSearchResults[TDoc],
    error: AlgoliaError,
    isSearchStalled: js.Any,
    searchResults: SearchResults[TDoc],
    searchState: SearchState,
    searching: Boolean,
    searchingForFacetValues: js.Any
  ): StateResultsProvided[TDoc] = {
    val __obj = js.Dynamic.literal(allSearchResults = allSearchResults.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any], searchState = searchState.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateResultsProvided[TDoc]]
  }
  @scala.inline
  implicit class StateResultsProvidedOps[Self[tdoc] <: StateResultsProvided[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDoc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDoc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDoc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDoc] with Other]
    @scala.inline
    def withAllSearchResults(value: AllSearchResults[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: AlgoliaError): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSearchStalled(value: js.Any): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchStalled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchResults(value: SearchResults[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchState(value: SearchState): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearching(value: Boolean): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchingForFacetValues(value: js.Any): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchingForFacetValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

