package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned in the google.longrunning.Operation response field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1ExportDocumentsResponse extends js.Object {
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1ExportDocumentsResponse {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ExportDocumentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1ExportDocumentsResponseOps[Self <: SchemaGoogleFirestoreAdminV1ExportDocumentsResponse] (val x: Self) extends AnyVal {
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
    def setOutputUriPrefix(value: String): Self = this.set("outputUriPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUriPrefix: Self = this.set("outputUriPrefix", js.undefined)
  }
  
}

