package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint extends js.Object {
  var parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint = js.native
  var request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData] = js.native
}

object ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint,
    request: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions,
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  ): ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpointOps[Self <: ParametersTeamsAddOrUpdateProjectPermissionsInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsAddOrUpdateProjectPermissionsInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateProjectPermissionsInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

