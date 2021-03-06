package typingsSlinky.reactMdMenu.useVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisibilityState extends js.Object {
  var defaultFocus: FocusType = js.native
  var visible: Boolean = js.native
}

object VisibilityState {
  @scala.inline
  def apply(defaultFocus: FocusType, visible: Boolean): VisibilityState = {
    val __obj = js.Dynamic.literal(defaultFocus = defaultFocus.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityState]
  }
  @scala.inline
  implicit class VisibilityStateOps[Self <: VisibilityState] (val x: Self) extends AnyVal {
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
    def setDefaultFocus(value: FocusType): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

