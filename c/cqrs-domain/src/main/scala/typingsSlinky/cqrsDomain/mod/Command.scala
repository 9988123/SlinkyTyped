package typingsSlinky.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  var id: String = js.native
}

object Command {
  @scala.inline
  def apply(id: String): Command = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

