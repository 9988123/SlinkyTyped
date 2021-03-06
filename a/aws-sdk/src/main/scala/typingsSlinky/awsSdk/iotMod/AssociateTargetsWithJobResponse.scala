package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTargetsWithJobResponse extends js.Object {
  /**
    * A short text description of the job.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * An ARN identifying the job.
    */
  var jobArn: js.UndefOr[JobArn] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.native
}

object AssociateTargetsWithJobResponse {
  @scala.inline
  def apply(): AssociateTargetsWithJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTargetsWithJobResponse]
  }
  @scala.inline
  implicit class AssociateTargetsWithJobResponseOps[Self <: AssociateTargetsWithJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: JobDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setJobArn(value: JobArn): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
  
}

