package typingsSlinky.expo.rootErrorBoundaryWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var error: js.Error | Null = js.native
}

object State {
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

