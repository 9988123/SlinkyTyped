package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBrowserTreeProperties extends ComponentProperties {
  var ownerUri: String = js.native
}

object FileBrowserTreeProperties {
  @scala.inline
  def apply(ownerUri: String): FileBrowserTreeProperties = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserTreeProperties]
  }
  @scala.inline
  implicit class FileBrowserTreePropertiesOps[Self <: FileBrowserTreeProperties] (val x: Self) extends AnyVal {
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
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
  }
  
}

