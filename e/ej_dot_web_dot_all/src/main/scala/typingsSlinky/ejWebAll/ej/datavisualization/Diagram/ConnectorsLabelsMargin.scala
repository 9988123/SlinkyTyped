package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorsLabelsMargin extends js.Object {
  /** To set the margin of the label in bottom direction
    * @Default {0}
    */
  var bottom: js.UndefOr[Double] = js.native
  /** To set the margin of the label in left direction
    * @Default {0}
    */
  var left: js.UndefOr[Double] = js.native
  /** To set the margin of the label in right direction
    * @Default {0}
    */
  var right: js.UndefOr[Double] = js.native
  /** To set the margin of the label in top direction
    * @Default {0}
    */
  var top: js.UndefOr[Double] = js.native
}

object ConnectorsLabelsMargin {
  @scala.inline
  def apply(): ConnectorsLabelsMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsLabelsMargin]
  }
  @scala.inline
  implicit class ConnectorsLabelsMarginOps[Self <: ConnectorsLabelsMargin] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

