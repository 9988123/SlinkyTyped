package typingsSlinky.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object DestroyEventArgs {
  @scala.inline
  def apply(): DestroyEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyEventArgs]
  }
  @scala.inline
  implicit class DestroyEventArgsOps[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

