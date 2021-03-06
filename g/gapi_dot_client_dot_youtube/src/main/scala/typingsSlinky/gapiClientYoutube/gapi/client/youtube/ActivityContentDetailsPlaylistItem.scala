package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityContentDetailsPlaylistItem extends js.Object {
  /** The value that YouTube uses to uniquely identify the playlist. */
  var playlistId: js.UndefOr[String] = js.native
  /** ID of the item within the playlist. */
  var playlistItemId: js.UndefOr[String] = js.native
  /** The resourceId object contains information about the resource that was added to the playlist. */
  var resourceId: js.UndefOr[ResourceId] = js.native
}

object ActivityContentDetailsPlaylistItem {
  @scala.inline
  def apply(): ActivityContentDetailsPlaylistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsPlaylistItem]
  }
  @scala.inline
  implicit class ActivityContentDetailsPlaylistItemOps[Self <: ActivityContentDetailsPlaylistItem] (val x: Self) extends AnyVal {
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
    def setPlaylistId(value: String): Self = this.set("playlistId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylistId: Self = this.set("playlistId", js.undefined)
    @scala.inline
    def setPlaylistItemId(value: String): Self = this.set("playlistItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaylistItemId: Self = this.set("playlistItemId", js.undefined)
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
  
}

