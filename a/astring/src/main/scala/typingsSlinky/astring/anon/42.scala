package typingsSlinky.astring.anon

import typingsSlinky.astring.astringStrings.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `42` extends js.Object {
  var `type`: FunctionDeclaration = js.native
}

object `42` {
  @scala.inline
  def apply(`type`: FunctionDeclaration): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
  @scala.inline
  implicit class `42Ops`[Self <: `42`] (val x: Self) extends AnyVal {
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
    def setType(value: FunctionDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

