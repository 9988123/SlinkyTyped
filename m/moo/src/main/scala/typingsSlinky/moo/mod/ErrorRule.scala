package typingsSlinky.moo.mod

import typingsSlinky.moo.mooBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorRule extends js.Object {
  var error: `true` = js.native
}

object ErrorRule {
  @scala.inline
  def apply(error: `true`): ErrorRule = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorRule]
  }
  @scala.inline
  implicit class ErrorRuleOps[Self <: ErrorRule] (val x: Self) extends AnyVal {
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

