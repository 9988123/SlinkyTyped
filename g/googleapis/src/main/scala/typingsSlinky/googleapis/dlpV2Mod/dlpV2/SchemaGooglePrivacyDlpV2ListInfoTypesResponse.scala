package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the ListInfoTypes request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListInfoTypesResponse extends js.Object {
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]] = js.native
}

object SchemaGooglePrivacyDlpV2ListInfoTypesResponse {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListInfoTypesResponseOps[Self <: SchemaGooglePrivacyDlpV2ListInfoTypesResponse] (val x: Self) extends AnyVal {
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
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeDescription*): Self = this.set("infoTypes", js.Array(value :_*))
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeDescription]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
  }
  
}

