package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListChildInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListChildInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListChildInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListChildInOrgEndpoint extends js.Object {
  var parameters: TeamsListChildInOrgEndpoint = js.native
  var request: TeamsListChildInOrgRequestOptions = js.native
  var response: OctokitResponse[TeamsListChildInOrgResponseData] = js.native
}

object ParametersTeamsListChildInOrgEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListChildInOrgEndpoint,
    request: TeamsListChildInOrgRequestOptions,
    response: OctokitResponse[TeamsListChildInOrgResponseData]
  ): ParametersTeamsListChildInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListChildInOrgEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListChildInOrgEndpointOps[Self <: ParametersTeamsListChildInOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListChildInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListChildInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListChildInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

