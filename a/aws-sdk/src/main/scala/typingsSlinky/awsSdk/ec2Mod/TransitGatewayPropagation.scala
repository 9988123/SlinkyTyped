package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayPropagation extends js.Object {
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType] = js.native
  /**
    * The state.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.native
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TransitGatewayAttachmentId] = js.native
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.native
}

object TransitGatewayPropagation {
  @scala.inline
  def apply(): TransitGatewayPropagation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPropagation]
  }
  @scala.inline
  implicit class TransitGatewayPropagationOps[Self <: TransitGatewayPropagation] (val x: Self) extends AnyVal {
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
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: TransitGatewayAttachmentResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setState(value: TransitGatewayPropagationState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = this.set("TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayAttachmentId: Self = this.set("TransitGatewayAttachmentId", js.undefined)
    @scala.inline
    def setTransitGatewayRouteTableId(value: String): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("TransitGatewayRouteTableId", js.undefined)
  }
  
}

