package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.PHOTO
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaId extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.undefined
}

object MediaId {
  @scala.inline
  def apply(mediaId: String, mediaType: PHOTO | VIDEO | CAROUSEL = null): MediaId = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaId]
  }
}

