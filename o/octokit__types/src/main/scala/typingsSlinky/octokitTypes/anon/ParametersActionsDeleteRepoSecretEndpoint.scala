package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsDeleteRepoSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsDeleteRepoSecretRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActionsDeleteRepoSecretEndpoint extends js.Object {
  var parameters: ActionsDeleteRepoSecretEndpoint = js.native
  var request: ActionsDeleteRepoSecretRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersActionsDeleteRepoSecretEndpoint {
  @scala.inline
  def apply(
    parameters: ActionsDeleteRepoSecretEndpoint,
    request: ActionsDeleteRepoSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteRepoSecretEndpoint]
  }
  @scala.inline
  implicit class ParametersActionsDeleteRepoSecretEndpointOps[Self <: ParametersActionsDeleteRepoSecretEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActionsDeleteRepoSecretEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActionsDeleteRepoSecretRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

