package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointVpcConfiguration extends js.Object {
  /**
    * This access point will only allow connections from the specified VPC ID.
    */
  var vpcId: Input[String] = js.native
}

object AccessPointVpcConfiguration {
  @scala.inline
  def apply(vpcId: Input[String]): AccessPointVpcConfiguration = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointVpcConfiguration]
  }
  @scala.inline
  implicit class AccessPointVpcConfigurationOps[Self <: AccessPointVpcConfiguration] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

