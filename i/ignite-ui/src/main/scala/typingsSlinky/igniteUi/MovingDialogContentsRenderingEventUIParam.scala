package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovingDialogContentsRenderingEventUIParam extends js.Object {
  /**
    * Gets a reference to the ColumnMoving widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object MovingDialogContentsRenderingEventUIParam {
  @scala.inline
  def apply(): MovingDialogContentsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingDialogContentsRenderingEventUIParam]
  }
  @scala.inline
  implicit class MovingDialogContentsRenderingEventUIParamOps[Self <: MovingDialogContentsRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

