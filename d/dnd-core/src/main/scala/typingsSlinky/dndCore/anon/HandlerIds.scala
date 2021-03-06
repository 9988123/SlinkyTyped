package typingsSlinky.dndCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[String]] = js.native
}

object HandlerIds {
  @scala.inline
  def apply(): HandlerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerIds]
  }
  @scala.inline
  implicit class HandlerIdsOps[Self <: HandlerIds] (val x: Self) extends AnyVal {
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
    def setHandlerIdsVarargs(value: String*): Self = this.set("handlerIds", js.Array(value :_*))
    @scala.inline
    def setHandlerIds(value: js.Array[String]): Self = this.set("handlerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlerIds: Self = this.set("handlerIds", js.undefined)
  }
  
}

