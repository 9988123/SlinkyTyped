package typingsSlinky.awsSdkClientPinpointBrowser.typesMessageBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBody extends js.Object {
  /**
    * The error message that's returned from the API.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The unique message body ID.
    */
  var RequestID: js.UndefOr[String] = js.native
}

object MessageBody {
  @scala.inline
  def apply(): MessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBody]
  }
  @scala.inline
  implicit class MessageBodyOps[Self <: MessageBody] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setRequestID(value: String): Self = this.set("RequestID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestID: Self = this.set("RequestID", js.undefined)
  }
  
}

