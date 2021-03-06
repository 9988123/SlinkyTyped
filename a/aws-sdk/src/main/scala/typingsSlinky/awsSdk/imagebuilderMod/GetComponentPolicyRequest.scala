package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component whose policy you want to retrieve. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
}

object GetComponentPolicyRequest {
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn): GetComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentPolicyRequest]
  }
  @scala.inline
  implicit class GetComponentPolicyRequestOps[Self <: GetComponentPolicyRequest] (val x: Self) extends AnyVal {
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
    def setComponentArn(value: ComponentBuildVersionArn): Self = this.set("componentArn", value.asInstanceOf[js.Any])
  }
  
}

