package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSetObject extends SetObject {
  /**
    * Choose the minutes interval between each time in the list.
    * Defaults to 30.
    */
  var interval: js.UndefOr[Double] = js.native
}

object TimeSetObject {
  @scala.inline
  def apply(): TimeSetObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSetObject]
  }
  @scala.inline
  implicit class TimeSetObjectOps[Self <: TimeSetObject] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
  
}

