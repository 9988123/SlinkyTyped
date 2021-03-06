package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowId extends js.Object {
  /**
    * Specify the tab to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var tabId: js.UndefOr[Double] = js.native
  /**
    * Specify the window to get the panel from. If no tab nor window is specified, the global panel is returned.
    */
  var windowId: js.UndefOr[Double] = js.native
}

object WindowId {
  @scala.inline
  def apply(): WindowId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowId]
  }
  @scala.inline
  implicit class WindowIdOps[Self <: WindowId] (val x: Self) extends AnyVal {
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
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

