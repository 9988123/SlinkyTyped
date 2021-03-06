package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCustomerGatewayResponse extends js.Object {
  /**
    * The customer gateway association.
    */
  var CustomerGatewayAssociation: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.CustomerGatewayAssociation] = js.native
}

object AssociateCustomerGatewayResponse {
  @scala.inline
  def apply(): AssociateCustomerGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateCustomerGatewayResponse]
  }
  @scala.inline
  implicit class AssociateCustomerGatewayResponseOps[Self <: AssociateCustomerGatewayResponse] (val x: Self) extends AnyVal {
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
    def setCustomerGatewayAssociation(value: CustomerGatewayAssociation): Self = this.set("CustomerGatewayAssociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerGatewayAssociation: Self = this.set("CustomerGatewayAssociation", js.undefined)
  }
  
}

