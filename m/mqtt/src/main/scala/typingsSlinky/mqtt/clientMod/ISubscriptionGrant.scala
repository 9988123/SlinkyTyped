package typingsSlinky.mqtt.clientMod

import typingsSlinky.mqttPacket.mod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionGrant extends js.Object {
  /*
    * no local flag
    * */
  var nl: js.UndefOr[Boolean] = js.native
  /**
    *  is the granted qos level on it, may return 128 on error
    */
  var qos: QoS | Double = js.native
  /*
    * Retain As Published flag
    * */
  var rap: js.UndefOr[Boolean] = js.native
  /*
    * Retain Handling option
    * */
  var rh: js.UndefOr[Double] = js.native
  /**
    *  is a subscribed to topic
    */
  var topic: String = js.native
}

object ISubscriptionGrant {
  @scala.inline
  def apply(qos: QoS | Double, topic: String): ISubscriptionGrant = {
    val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionGrant]
  }
  @scala.inline
  implicit class ISubscriptionGrantOps[Self <: ISubscriptionGrant] (val x: Self) extends AnyVal {
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
    def setQos(value: QoS | Double): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setNl(value: Boolean): Self = this.set("nl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNl: Self = this.set("nl", js.undefined)
    @scala.inline
    def setRap(value: Boolean): Self = this.set("rap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRap: Self = this.set("rap", js.undefined)
    @scala.inline
    def setRh(value: Double): Self = this.set("rh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRh: Self = this.set("rh", js.undefined)
  }
  
}

