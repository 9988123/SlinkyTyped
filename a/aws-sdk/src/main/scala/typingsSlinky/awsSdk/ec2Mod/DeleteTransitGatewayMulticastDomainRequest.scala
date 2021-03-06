package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayMulticastDomainRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomainId: typingsSlinky.awsSdk.ec2Mod.TransitGatewayMulticastDomainId = js.native
}

object DeleteTransitGatewayMulticastDomainRequest {
  @scala.inline
  def apply(TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId): DeleteTransitGatewayMulticastDomainRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayMulticastDomainId = TransitGatewayMulticastDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainRequest]
  }
  @scala.inline
  implicit class DeleteTransitGatewayMulticastDomainRequestOps[Self <: DeleteTransitGatewayMulticastDomainRequest] (val x: Self) extends AnyVal {
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
    def setTransitGatewayMulticastDomainId(value: TransitGatewayMulticastDomainId): Self = this.set("TransitGatewayMulticastDomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

