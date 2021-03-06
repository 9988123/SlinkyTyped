package typingsSlinky.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelEventArgs extends js.Object {
  /** Canceled FileList Object.
    */
  var fileStatus: js.UndefOr[js.Any] = js.native
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object CancelEventArgs {
  @scala.inline
  def apply(): CancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelEventArgs]
  }
  @scala.inline
  implicit class CancelEventArgsOps[Self <: CancelEventArgs] (val x: Self) extends AnyVal {
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
    def setFileStatus(value: js.Any): Self = this.set("fileStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileStatus: Self = this.set("fileStatus", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

