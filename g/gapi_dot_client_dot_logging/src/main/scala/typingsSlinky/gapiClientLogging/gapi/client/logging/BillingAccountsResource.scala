package typingsSlinky.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingAccountsResource extends js.Object {
  var exclusions: ExclusionsResource = js.native
  var logs: LogsResource = js.native
  var sinks: SinksResource = js.native
}

object BillingAccountsResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, sinks: SinksResource): BillingAccountsResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingAccountsResource]
  }
  @scala.inline
  implicit class BillingAccountsResourceOps[Self <: BillingAccountsResource] (val x: Self) extends AnyVal {
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
    def setExclusions(value: ExclusionsResource): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogs(value: LogsResource): Self = this.set("logs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSinks(value: SinksResource): Self = this.set("sinks", value.asInstanceOf[js.Any])
  }
  
}

