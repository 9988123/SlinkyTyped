package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main language translation response message.
  */
@js.native
trait SchemaTranslationsListResponse extends js.Object {
  /**
    * Translations contains list of translation results of given text
    */
  var translations: js.UndefOr[js.Array[SchemaTranslationsResource]] = js.native
}

object SchemaTranslationsListResponse {
  @scala.inline
  def apply(): SchemaTranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsListResponse]
  }
  @scala.inline
  implicit class SchemaTranslationsListResponseOps[Self <: SchemaTranslationsListResponse] (val x: Self) extends AnyVal {
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
    def setTranslationsVarargs(value: SchemaTranslationsResource*): Self = this.set("translations", js.Array(value :_*))
    @scala.inline
    def setTranslations(value: js.Array[SchemaTranslationsResource]): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

