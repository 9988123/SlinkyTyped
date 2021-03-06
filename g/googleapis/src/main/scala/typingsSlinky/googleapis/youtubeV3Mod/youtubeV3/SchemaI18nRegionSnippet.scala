package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n region, such as region code and human-readable
  * name.
  */
@js.native
trait SchemaI18nRegionSnippet extends js.Object {
  /**
    * The region code as a 2-letter ISO country code.
    */
  var gl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the region.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaI18nRegionSnippet {
  @scala.inline
  def apply(): SchemaI18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nRegionSnippet]
  }
  @scala.inline
  implicit class SchemaI18nRegionSnippetOps[Self <: SchemaI18nRegionSnippet] (val x: Self) extends AnyVal {
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
    def setGl(value: String): Self = this.set("gl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

