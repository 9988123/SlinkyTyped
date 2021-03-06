package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathJSON extends js.Object {
  var fixPrefix: js.UndefOr[Boolean] = js.native
  var mathjs: js.UndefOr[String] = js.native
  var unit: String = js.native
  var value: Double = js.native
}

object MathJSON {
  @scala.inline
  def apply(unit: String, value: Double): MathJSON = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJSON]
  }
  @scala.inline
  implicit class MathJSONOps[Self <: MathJSON] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixPrefix(value: Boolean): Self = this.set("fixPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixPrefix: Self = this.set("fixPrefix", js.undefined)
    @scala.inline
    def setMathjs(value: String): Self = this.set("mathjs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMathjs: Self = this.set("mathjs", js.undefined)
  }
  
}

