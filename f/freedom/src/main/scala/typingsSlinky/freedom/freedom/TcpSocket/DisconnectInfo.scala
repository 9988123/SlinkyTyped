package typingsSlinky.freedom.freedom.TcpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisconnectInfo extends js.Object {
  var errcode: String = js.native
  var message: String = js.native
}

object DisconnectInfo {
  @scala.inline
  def apply(errcode: String, message: String): DisconnectInfo = {
    val __obj = js.Dynamic.literal(errcode = errcode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectInfo]
  }
  @scala.inline
  implicit class DisconnectInfoOps[Self <: DisconnectInfo] (val x: Self) extends AnyVal {
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
    def setErrcode(value: String): Self = this.set("errcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

