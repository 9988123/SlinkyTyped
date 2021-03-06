package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  var create: scala.Double = js.native
  var delete: scala.Double = js.native
  var update: scala.Double = js.native
}

object Delete {
  @scala.inline
  def apply(create: scala.Double, delete: scala.Double, update: scala.Double): Delete = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
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
    def setCreate(value: scala.Double): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: scala.Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: scala.Double): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}

