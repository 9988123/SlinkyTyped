package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.ArrowFunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `46` extends js.Object {
  var `type`: ArrowFunctionExpression = js.native
}

object `46` {
  @scala.inline
  def apply(`type`: ArrowFunctionExpression): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  @scala.inline
  implicit class `46Ops`[Self <: `46`] (val x: Self) extends AnyVal {
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
    def setType(value: ArrowFunctionExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

