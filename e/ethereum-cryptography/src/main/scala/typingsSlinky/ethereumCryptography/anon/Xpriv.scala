package typingsSlinky.ethereumCryptography.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xpriv extends js.Object {
  var xpriv: String = js.native
}

object Xpriv {
  @scala.inline
  def apply(xpriv: String): Xpriv = {
    val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpriv]
  }
  @scala.inline
  implicit class XprivOps[Self <: Xpriv] (val x: Self) extends AnyVal {
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
    def setXpriv(value: String): Self = this.set("xpriv", value.asInstanceOf[js.Any])
  }
  
}

