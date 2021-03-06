package typingsSlinky.googleapis.v2beta2Mod.cloudtasksV2beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsQueuesTasksAcknowledge extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The task name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAcknowledgeTaskRequest] = js.native
}

object ParamsResourceProjectsLocationsQueuesTasksAcknowledge {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsQueuesTasksAcknowledge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsQueuesTasksAcknowledge]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsQueuesTasksAcknowledgeOps[Self <: ParamsResourceProjectsLocationsQueuesTasksAcknowledge] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaAcknowledgeTaskRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

