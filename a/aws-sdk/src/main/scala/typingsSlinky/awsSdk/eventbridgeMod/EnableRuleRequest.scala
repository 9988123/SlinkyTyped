package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableRuleRequest extends js.Object {
  /**
    * The event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.EventBusName] = js.native
  /**
    * The name of the rule.
    */
  var Name: RuleName = js.native
}

object EnableRuleRequest {
  @scala.inline
  def apply(Name: RuleName): EnableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableRuleRequest]
  }
  @scala.inline
  implicit class EnableRuleRequestOps[Self <: EnableRuleRequest] (val x: Self) extends AnyVal {
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
    def setName(value: RuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBusName(value: EventBusName): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
  }
  
}

