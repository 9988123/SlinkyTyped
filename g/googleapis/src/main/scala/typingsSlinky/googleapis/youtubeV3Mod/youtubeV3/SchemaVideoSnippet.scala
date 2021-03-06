package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video, including title, description, uploader,
  * thumbnails and category.
  */
@js.native
trait SchemaVideoSnippet extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video
    * was uploaded to.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * The default_audio_language property specifies the language spoken in the
    * video&#39;s default audio track.
    */
  var defaultAudioLanguage: js.UndefOr[String] = js.native
  /**
    * The language of the videos&#39;s default snippet.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * The video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates if the video is an upcoming/active live broadcast. Or it&#39;s
    * &quot;none&quot; if the video is not an upcoming/active live broadcast.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  /**
    * Localized snippet selected with the hl parameter. If no such localization
    * exists, this field is populated with the default snippet. (Read-only)
    */
  var localized: js.UndefOr[SchemaVideoLocalization] = js.native
  /**
    * The date and time that the video was uploaded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A list of keyword tags associated with the video. Tags may contain
    * spaces.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoSnippet {
  @scala.inline
  def apply(): SchemaVideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSnippet]
  }
  @scala.inline
  implicit class SchemaVideoSnippetOps[Self <: SchemaVideoSnippet] (val x: Self) extends AnyVal {
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
    def setCategoryId(value: String): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setChannelTitle(value: String): Self = this.set("channelTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelTitle: Self = this.set("channelTitle", js.undefined)
    @scala.inline
    def setDefaultAudioLanguage(value: String): Self = this.set("defaultAudioLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAudioLanguage: Self = this.set("defaultAudioLanguage", js.undefined)
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLiveBroadcastContent(value: String): Self = this.set("liveBroadcastContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveBroadcastContent: Self = this.set("liveBroadcastContent", js.undefined)
    @scala.inline
    def setLocalized(value: SchemaVideoLocalization): Self = this.set("localized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

