package typingsSlinky.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the distance thresholds for a CrossSliding interaction. */
@js.native
trait CrossSlideThresholds extends js.Object {
  /** The distance, in DIPs, from the initial point of contact until the rearrange action is initiated. */
  var rearrangeStart: Double = js.native
  /** The distance, in DIPs, from the initial point of contact until the selection action is initiated. */
  var selectionStart: Double = js.native
  /** The distance, in DIPs, from the initial point of contact until the end of the speed bump. */
  var speedBumpEnd: Double = js.native
  /** The distance, in DIPs, from the initial point of contact until the speed bump is initiated. */
  var speedBumpStart: Double = js.native
}

object CrossSlideThresholds {
  @scala.inline
  def apply(rearrangeStart: Double, selectionStart: Double, speedBumpEnd: Double, speedBumpStart: Double): CrossSlideThresholds = {
    val __obj = js.Dynamic.literal(rearrangeStart = rearrangeStart.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], speedBumpEnd = speedBumpEnd.asInstanceOf[js.Any], speedBumpStart = speedBumpStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlideThresholds]
  }
  @scala.inline
  implicit class CrossSlideThresholdsOps[Self <: CrossSlideThresholds] (val x: Self) extends AnyVal {
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
    def setRearrangeStart(value: Double): Self = this.set("rearrangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedBumpEnd(value: Double): Self = this.set("speedBumpEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeedBumpStart(value: Double): Self = this.set("speedBumpStart", value.asInstanceOf[js.Any])
  }
  
}

