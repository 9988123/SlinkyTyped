package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairMarker extends js.Object {
  /** Options for customizing the border.
    */
  var border: js.UndefOr[CrosshairMarkerBorder] = js.native
  /** Opacity of the marker.
    * @Default {true}
    */
  var opacity: js.UndefOr[Boolean] = js.native
  /** Options for customizing the size of the marker.
    */
  var size: js.UndefOr[CrosshairMarkerSize] = js.native
  /** Show/hides the marker.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object CrosshairMarker {
  @scala.inline
  def apply(): CrosshairMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairMarker]
  }
  @scala.inline
  implicit class CrosshairMarkerOps[Self <: CrosshairMarker] (val x: Self) extends AnyVal {
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
    def setBorder(value: CrosshairMarkerBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: CrosshairMarkerSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

