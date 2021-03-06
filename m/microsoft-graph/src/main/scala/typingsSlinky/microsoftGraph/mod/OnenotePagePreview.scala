package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePagePreview extends js.Object {
  var links: js.UndefOr[OnenotePagePreviewLinks] = js.native
  var previewText: js.UndefOr[String] = js.native
}

object OnenotePagePreview {
  @scala.inline
  def apply(): OnenotePagePreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreview]
  }
  @scala.inline
  implicit class OnenotePagePreviewOps[Self <: OnenotePagePreview] (val x: Self) extends AnyVal {
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
    def setLinks(value: OnenotePagePreviewLinks): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setPreviewText(value: String): Self = this.set("previewText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewText: Self = this.set("previewText", js.undefined)
  }
  
}

