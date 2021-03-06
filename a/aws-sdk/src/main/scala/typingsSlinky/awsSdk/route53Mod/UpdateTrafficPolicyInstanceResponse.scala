package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the updated traffic policy instance.
    */
  var TrafficPolicyInstance: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}

object UpdateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): UpdateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
  }
  @scala.inline
  implicit class UpdateTrafficPolicyInstanceResponseOps[Self <: UpdateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
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
    def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = this.set("TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
  
}

