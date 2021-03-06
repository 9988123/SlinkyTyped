package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BackupRun resource.
  */
@js.native
trait SchemaBackupRun extends js.Object {
  /**
    * The description of this run, only applicable to on-demand backups.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time the backup operation completed in UTC timezone in RFC 3339
    * format, for example 2012-11-15T16:19:00.094Z.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The time the run was enqueued in UTC timezone in RFC 3339 format, for
    * example 2012-11-15T16:19:00.094Z.
    */
  var enqueuedTime: js.UndefOr[String] = js.native
  /**
    * Information about why the backup operation failed. This is only present
    * if the run has the FAILED status.
    */
  var error: js.UndefOr[SchemaOperationError] = js.native
  /**
    * The identifier for this backup run. Unique only for a specific Cloud SQL
    * instance.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the database instance.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * This is always sql#backupRun.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The time the backup operation actually started in UTC timezone in RFC
    * 3339 format, for example 2012-11-15T16:19:00.094Z.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The status of this run.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The type of this run; can be either &quot;AUTOMATED&quot; or
    * &quot;ON_DEMAND&quot;.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The start time of the backup window during which this the backup was
    * attempted in RFC 3339 format, for example 2012-11-15T16:19:00.094Z.
    */
  var windowStartTime: js.UndefOr[String] = js.native
}

object SchemaBackupRun {
  @scala.inline
  def apply(): SchemaBackupRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupRun]
  }
  @scala.inline
  implicit class SchemaBackupRunOps[Self <: SchemaBackupRun] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEnqueuedTime(value: String): Self = this.set("enqueuedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnqueuedTime: Self = this.set("enqueuedTime", js.undefined)
    @scala.inline
    def setError(value: SchemaOperationError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWindowStartTime(value: String): Self = this.set("windowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowStartTime: Self = this.set("windowStartTime", js.undefined)
  }
  
}

