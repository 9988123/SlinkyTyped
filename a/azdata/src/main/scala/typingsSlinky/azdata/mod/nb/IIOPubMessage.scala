package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.azdataStrings.iopub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIOPubMessage extends IMessage {
  var channel: iopub = js.native
}

object IIOPubMessage {
  @scala.inline
  def apply(
    channel: iopub,
    content: js.Any,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IIOPubMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage]
  }
  @scala.inline
  implicit class IIOPubMessageOps[Self <: IIOPubMessage] (val x: Self) extends AnyVal {
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
    def setChannel(value: iopub): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

