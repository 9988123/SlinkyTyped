package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesMarkerPointersBorder extends js.Object {
  /** Specifies the border color of marker pointer
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the border of marker pointer
    * @Default {number}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesMarkerPointersBorder {
  @scala.inline
  def apply(): ScalesMarkerPointersBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesMarkerPointersBorder]
  }
  @scala.inline
  implicit class ScalesMarkerPointersBorderOps[Self <: ScalesMarkerPointersBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

