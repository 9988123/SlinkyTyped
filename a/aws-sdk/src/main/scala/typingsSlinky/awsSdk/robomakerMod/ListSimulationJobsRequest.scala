package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSimulationJobsRequest extends js.Object {
  /**
    * Optional filters to limit results. The filter names status and simulationApplicationName and robotApplicationName are supported. When filtering, you must use the complete value of the filtered item. You can use up to three filters, but they must be for the same named item. For example, if you are looking for items with the status Preparing or the status Running.
    */
  var filters: js.UndefOr[Filters] = js.native
  /**
    * When this parameter is used, ListSimulationJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListSimulationJobs request with the returned nextToken value. This value can be between 1 and 1000. If this parameter is not used, then ListSimulationJobs returns up to 1000 results and a nextToken value if applicable. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated ListSimulationJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListSimulationJobsRequest {
  @scala.inline
  def apply(): ListSimulationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationJobsRequest]
  }
  @scala.inline
  implicit class ListSimulationJobsRequestOps[Self <: ListSimulationJobsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

