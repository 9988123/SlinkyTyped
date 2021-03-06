package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnShipment extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var deliveryDate: js.UndefOr[String] = js.native
  var returnMethodType: js.UndefOr[String] = js.native
  var shipmentId: js.UndefOr[String] = js.native
  var shipmentTrackingInfos: js.UndefOr[js.Array[ShipmentTrackingInfo]] = js.native
  var shippingDate: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object ReturnShipment {
  @scala.inline
  def apply(): ReturnShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnShipment]
  }
  @scala.inline
  implicit class ReturnShipmentOps[Self <: ReturnShipment] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDeliveryDate(value: String): Self = this.set("deliveryDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryDate: Self = this.set("deliveryDate", js.undefined)
    @scala.inline
    def setReturnMethodType(value: String): Self = this.set("returnMethodType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnMethodType: Self = this.set("returnMethodType", js.undefined)
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    @scala.inline
    def setShipmentTrackingInfosVarargs(value: ShipmentTrackingInfo*): Self = this.set("shipmentTrackingInfos", js.Array(value :_*))
    @scala.inline
    def setShipmentTrackingInfos(value: js.Array[ShipmentTrackingInfo]): Self = this.set("shipmentTrackingInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipmentTrackingInfos: Self = this.set("shipmentTrackingInfos", js.undefined)
    @scala.inline
    def setShippingDate(value: String): Self = this.set("shippingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingDate: Self = this.set("shippingDate", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

