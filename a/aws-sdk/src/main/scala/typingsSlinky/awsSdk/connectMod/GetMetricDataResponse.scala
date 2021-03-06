package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricDataResponse extends js.Object {
  /**
    * Information about the historical metrics. If no grouping is specified, a summary of metric data is returned.
    */
  var MetricResults: js.UndefOr[HistoricalMetricResults] = js.native
  /**
    * If there are additional results, this is the token for the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}

object GetMetricDataResponse {
  @scala.inline
  def apply(): GetMetricDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataResponse]
  }
  @scala.inline
  implicit class GetMetricDataResponseOps[Self <: GetMetricDataResponse] (val x: Self) extends AnyVal {
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
    def setMetricResultsVarargs(value: HistoricalMetricResult*): Self = this.set("MetricResults", js.Array(value :_*))
    @scala.inline
    def setMetricResults(value: HistoricalMetricResults): Self = this.set("MetricResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricResults: Self = this.set("MetricResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

