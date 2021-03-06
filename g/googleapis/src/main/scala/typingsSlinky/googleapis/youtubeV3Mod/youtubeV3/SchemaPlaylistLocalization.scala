package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist localization setting
  */
@js.native
trait SchemaPlaylistLocalization extends js.Object {
  /**
    * The localized strings for playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The localized strings for playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaPlaylistLocalization {
  @scala.inline
  def apply(): SchemaPlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistLocalization]
  }
  @scala.inline
  implicit class SchemaPlaylistLocalizationOps[Self <: SchemaPlaylistLocalization] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

