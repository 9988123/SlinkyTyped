package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayPeeringAttachmentResult extends js.Object {
  /**
    * The transit gateway peering attachment.
    */
  var TransitGatewayPeeringAttachment: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayPeeringAttachment] = js.native
}

object DeleteTransitGatewayPeeringAttachmentResult {
  @scala.inline
  def apply(): DeleteTransitGatewayPeeringAttachmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPeeringAttachmentResult]
  }
  @scala.inline
  implicit class DeleteTransitGatewayPeeringAttachmentResultOps[Self <: DeleteTransitGatewayPeeringAttachmentResult] (val x: Self) extends AnyVal {
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
    def setTransitGatewayPeeringAttachment(value: TransitGatewayPeeringAttachment): Self = this.set("TransitGatewayPeeringAttachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayPeeringAttachment: Self = this.set("TransitGatewayPeeringAttachment", js.undefined)
  }
  
}

