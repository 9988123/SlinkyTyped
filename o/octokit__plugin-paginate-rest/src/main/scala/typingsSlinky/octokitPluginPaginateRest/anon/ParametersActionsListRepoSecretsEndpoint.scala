package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsListRepoSecretsEndpoint extends js.Object {
  var parameters: ActionsListRepoSecretsEndpoint = js.native
  var response: OctokitResponse[ActionsListRepoSecretsResponseData] with `7` = js.native
}

object ParametersActionsListRepoSecretsEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsListRepoSecretsEndpoint,
    response: OctokitResponse[ActionsListRepoSecretsResponseData] with `7`
  ): ParametersActionsListRepoSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoSecretsEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsListRepoSecretsEndpointOps[Self <: ParametersActionsListRepoSecretsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsListRepoSecretsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoSecretsResponseData] with `7`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

