package typingsSlinky.reactToolbox.listItemActionMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemActionProps extends js.Object {
  /**
    * List item action.
    */
  var action: js.UndefOr[ReactElement] = js.native
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemActionTheme] = js.native
}

object ListItemActionProps {
  @scala.inline
  def apply(): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionProps]
  }
  @scala.inline
  implicit class ListItemActionPropsOps[Self <: ListItemActionProps] (val x: Self) extends AnyVal {
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
    def setActionReactElement(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setTheme(value: ListItemActionTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

