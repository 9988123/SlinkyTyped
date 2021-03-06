package typingsSlinky.semanticUiSidebar.anon

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'computer'> */
@js.native
trait PickImplcomputer extends js.Object {
  var computer: ComputerSettings = js.native
}

object PickImplcomputer {
  @scala.inline
  def apply(computer: ComputerSettings): PickImplcomputer = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcomputer]
  }
  @scala.inline
  implicit class PickImplcomputerOps[Self <: PickImplcomputer] (val x: Self) extends AnyVal {
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
    def setComputer(value: ComputerSettings): Self = this.set("computer", value.asInstanceOf[js.Any])
  }
  
}

