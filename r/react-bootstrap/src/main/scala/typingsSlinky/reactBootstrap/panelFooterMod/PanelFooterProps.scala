package typingsSlinky.reactBootstrap.panelFooterMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelFooterProps
  extends AllHTMLAttributes[PanelFooter]
     with ClassAttributes[PanelFooter] {
  var bsClass: js.UndefOr[String] = js.native
}

object PanelFooterProps {
  @scala.inline
  def apply(): PanelFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelFooterProps]
  }
  @scala.inline
  implicit class PanelFooterPropsOps[Self <: PanelFooterProps] (val x: Self) extends AnyVal {
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
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
  }
  
}

