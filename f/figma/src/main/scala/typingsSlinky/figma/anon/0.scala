package typingsSlinky.figma.anon

import typingsSlinky.figma.figmaStrings.AUTO
import typingsSlinky.figma.mod.global.LineHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends LineHeight {
  val unit: AUTO = js.native
}

object `0` {
  @scala.inline
  def apply(unit: AUTO): `0` = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setUnit(value: AUTO): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

