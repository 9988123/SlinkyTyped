package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.ExportDocuments.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata extends js.Object {
  /**
    * Which collection ids are being exported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The state of the export operation.
    */
  var operationState: js.UndefOr[String] = js.native
  /**
    * Where the entities are being exported to.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.native
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1Progress] = js.native
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1ExportDocumentsMetadataOps[Self <: SchemaGoogleFirestoreAdminV1ExportDocumentsMetadata] (val x: Self) extends AnyVal {
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
    def setCollectionIdsVarargs(value: String*): Self = this.set("collectionIds", js.Array(value :_*))
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = this.set("collectionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionIds: Self = this.set("collectionIds", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setOperationState(value: String): Self = this.set("operationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationState: Self = this.set("operationState", js.undefined)
    @scala.inline
    def setOutputUriPrefix(value: String): Self = this.set("outputUriPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUriPrefix: Self = this.set("outputUriPrefix", js.undefined)
    @scala.inline
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1Progress): Self = this.set("progressDocuments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressDocuments: Self = this.set("progressDocuments", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

