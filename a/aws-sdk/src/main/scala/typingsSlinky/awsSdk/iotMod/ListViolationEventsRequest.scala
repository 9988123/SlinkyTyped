package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViolationEventsRequest extends js.Object {
  /**
    * The end time for the alerts to be listed.
    */
  var endTime: js.Date = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A filter to limit results to those alerts generated by the specified security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The start time for the alerts to be listed.
    */
  var startTime: js.Date = js.native
  /**
    * A filter to limit results to those alerts caused by the specified thing.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
}

object ListViolationEventsRequest {
  @scala.inline
  def apply(endTime: js.Date, startTime: js.Date): ListViolationEventsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViolationEventsRequest]
  }
  @scala.inline
  implicit class ListViolationEventsRequestOps[Self <: ListViolationEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
  
}

