package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVisibleSizeRequest extends js.Object {
  /**
    * Frame height (DIP).
    */
  var height: integer = js.native
  /**
    * Frame width (DIP).
    */
  var width: integer = js.native
}

object SetVisibleSizeRequest {
  @scala.inline
  def apply(height: integer, width: integer): SetVisibleSizeRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVisibleSizeRequest]
  }
  @scala.inline
  implicit class SetVisibleSizeRequestOps[Self <: SetVisibleSizeRequest] (val x: Self) extends AnyVal {
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
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

