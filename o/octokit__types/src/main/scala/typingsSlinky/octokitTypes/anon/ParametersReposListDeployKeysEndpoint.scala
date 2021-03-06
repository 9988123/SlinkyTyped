package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListDeployKeysEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeployKeysRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeployKeysResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListDeployKeysEndpoint extends js.Object {
  var parameters: ReposListDeployKeysEndpoint = js.native
  var request: ReposListDeployKeysRequestOptions = js.native
  var response: OctokitResponse[ReposListDeployKeysResponseData] = js.native
}

object ParametersReposListDeployKeysEndpoint {
  @scala.inline
  def apply(
    parameters: ReposListDeployKeysEndpoint,
    request: ReposListDeployKeysRequestOptions,
    response: OctokitResponse[ReposListDeployKeysResponseData]
  ): ParametersReposListDeployKeysEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeployKeysEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListDeployKeysEndpointOps[Self <: ParametersReposListDeployKeysEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListDeployKeysEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposListDeployKeysRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeployKeysResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

