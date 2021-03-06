package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricValue extends js.Object {
  /** A boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.native
  /** A double precision floating point value. */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * The end of the time period over which this metric value's measurement
    * applies.
    */
  var endTime: js.UndefOr[String] = js.native
  /** A signed 64-bit integer value. */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * The labels describing the metric value.
    * See comments on google.api.servicecontrol.v1.Operation.labels for
    * the overriding relationship.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** A money value. */
  var moneyValue: js.UndefOr[Money] = js.native
  /**
    * The start of the time period over which this metric value's measurement
    * applies. The time period has different semantics for different metric
    * types (cumulative, delta, and gauge). See the metric definition
    * documentation in the service configuration for details.
    */
  var startTime: js.UndefOr[String] = js.native
  /** A text string value. */
  var stringValue: js.UndefOr[String] = js.native
}

object MetricValue {
  @scala.inline
  def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  @scala.inline
  implicit class MetricValueOps[Self <: MetricValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setDistributionValue(value: Distribution): Self = this.set("distributionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionValue: Self = this.set("distributionValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMoneyValue(value: Money): Self = this.set("moneyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoneyValue: Self = this.set("moneyValue", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

