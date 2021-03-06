package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListJobsForWorkflowRunResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListJobsForWorkflowRunEndpoint extends js.Object {
  var parameters: ActionsListJobsForWorkflowRunEndpoint = js.native
  var request: ActionsListJobsForWorkflowRunRequestOptions = js.native
  var response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData] = js.native
}

object ParametersActionsListJobsForWorkflowRunEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListJobsForWorkflowRunEndpoint,
    request: ActionsListJobsForWorkflowRunRequestOptions,
    response: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]
  ): ParametersActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListJobsForWorkflowRunEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListJobsForWorkflowRunEndpointOps[Self <: ParametersActionsListJobsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListJobsForWorkflowRunEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsListJobsForWorkflowRunRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListJobsForWorkflowRunResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

