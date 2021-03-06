package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadControlDropZoneEnterEventArgs extends EventArgs {
  val dropZone: js.Any = js.native
}

object UploadControlDropZoneEnterEventArgs {
  @scala.inline
  def apply(dropZone: js.Any, sender: Control): UploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneEnterEventArgs]
  }
  @scala.inline
  implicit class UploadControlDropZoneEnterEventArgsOps[Self <: UploadControlDropZoneEnterEventArgs] (val x: Self) extends AnyVal {
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
    def setDropZone(value: js.Any): Self = this.set("dropZone", value.asInstanceOf[js.Any])
  }
  
}

