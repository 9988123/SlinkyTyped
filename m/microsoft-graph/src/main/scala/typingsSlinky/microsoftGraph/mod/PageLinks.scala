package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageLinks extends js.Object {
  // Opens the page in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.native
  // Opens the page in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.native
}

object PageLinks {
  @scala.inline
  def apply(): PageLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLinks]
  }
  @scala.inline
  implicit class PageLinksOps[Self <: PageLinks] (val x: Self) extends AnyVal {
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
    def setOneNoteClientUrl(value: ExternalLink): Self = this.set("oneNoteClientUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneNoteClientUrl: Self = this.set("oneNoteClientUrl", js.undefined)
    @scala.inline
    def setOneNoteWebUrl(value: ExternalLink): Self = this.set("oneNoteWebUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneNoteWebUrl: Self = this.set("oneNoteWebUrl", js.undefined)
  }
  
}

