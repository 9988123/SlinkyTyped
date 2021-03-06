package typingsSlinky.mongorito.mod

import typingsSlinky.mongorito.mod.ActionTypes.SAVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveAction extends Action {
  var fields: js.Object = js.native
  var `type`: SAVE = js.native
}

object SaveAction {
  @scala.inline
  def apply(fields: js.Object, `type`: SAVE): SaveAction = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAction]
  }
  @scala.inline
  implicit class SaveActionOps[Self <: SaveAction] (val x: Self) extends AnyVal {
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
    def setFields(value: js.Object): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SAVE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

