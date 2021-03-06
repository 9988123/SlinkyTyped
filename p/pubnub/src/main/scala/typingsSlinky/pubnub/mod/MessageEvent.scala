package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEvent extends js.Object {
  /**
    * deprecated:
    */
  var actualChannel: String = js.native
  var channel: String = js.native
  var message: js.Any = js.native
  var publisher: String = js.native
  /**
    * deprecated:
    */
  var subscribedChannel: String = js.native
  var subscription: String = js.native
  var timetoken: String = js.native
}

object MessageEvent {
  @scala.inline
  def apply(
    actualChannel: String,
    channel: String,
    message: js.Any,
    publisher: String,
    subscribedChannel: String,
    subscription: String,
    timetoken: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  @scala.inline
  implicit class MessageEventOps[Self <: MessageEvent] (val x: Self) extends AnyVal {
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
    def setActualChannel(value: String): Self = this.set("actualChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribedChannel(value: String): Self = this.set("subscribedChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimetoken(value: String): Self = this.set("timetoken", value.asInstanceOf[js.Any])
  }
  
}

