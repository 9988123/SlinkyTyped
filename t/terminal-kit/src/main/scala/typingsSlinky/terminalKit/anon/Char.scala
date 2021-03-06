package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Char extends js.Object {
  var attr: Attributes = js.native
  var char: String = js.native
}

object Char {
  @scala.inline
  def apply(attr: Attributes, char: String): Char = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[Char]
  }
  @scala.inline
  implicit class CharOps[Self <: Char] (val x: Self) extends AnyVal {
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
    def setAttr(value: Attributes): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
  }
  
}

