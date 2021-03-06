package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[Boolean] = js.native
  /** The YouTube channel that created the video category. */
  var channelId: js.UndefOr[String] = js.native
  /** The video category's title. */
  var title: js.UndefOr[String] = js.native
}

object VideoCategorySnippet {
  @scala.inline
  def apply(): VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoCategorySnippet]
  }
  @scala.inline
  implicit class VideoCategorySnippetOps[Self <: VideoCategorySnippet] (val x: Self) extends AnyVal {
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
    def setAssignable(value: Boolean): Self = this.set("assignable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignable: Self = this.set("assignable", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

