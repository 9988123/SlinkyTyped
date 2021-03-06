package typingsSlinky.pulumiKubernetes.outputMod.apiregistration.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceCondition describes the state of an APIService at a particular point
  */
@js.native
trait APIServiceCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: String = js.native
  /**
    * Human-readable message indicating details about last transition.
    */
  var message: String = js.native
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: String = js.native
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  var status: String = js.native
  /**
    * Type is the type of the condition.
    */
  var `type`: String = js.native
}

object APIServiceCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): APIServiceCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceCondition]
  }
  @scala.inline
  implicit class APIServiceConditionOps[Self <: APIServiceCondition] (val x: Self) extends AnyVal {
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
    def setLastTransitionTime(value: String): Self = this.set("lastTransitionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

