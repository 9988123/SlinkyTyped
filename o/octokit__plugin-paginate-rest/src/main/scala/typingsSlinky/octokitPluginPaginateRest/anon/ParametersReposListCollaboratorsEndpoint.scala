package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListCollaboratorsEndpoint extends js.Object {
  var parameters: ReposListCollaboratorsEndpoint = js.native
  var response: OctokitResponse[ReposListCollaboratorsResponseData] = js.native
}

object ParametersReposListCollaboratorsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListCollaboratorsEndpoint,
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): ParametersReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCollaboratorsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListCollaboratorsEndpointOps[Self <: ParametersReposListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListCollaboratorsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCollaboratorsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

