package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.native
  var ignoreBOM: js.UndefOr[Boolean] = js.native
}

object Fatal {
  @scala.inline
  def apply(): Fatal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fatal]
  }
  @scala.inline
  implicit class FatalOps[Self <: Fatal] (val x: Self) extends AnyVal {
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
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    @scala.inline
    def setIgnoreBOM(value: Boolean): Self = this.set("ignoreBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreBOM: Self = this.set("ignoreBOM", js.undefined)
  }
  
}

