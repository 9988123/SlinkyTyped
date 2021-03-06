package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposListLanguagesEndpoint extends js.Object {
  var parameters: ReposListLanguagesEndpoint = js.native
  var response: OctokitResponse[ReposListLanguagesResponseData] = js.native
}

object ParametersReposListLanguagesEndpoint {
  @scala.inline
  def apply(parameters: ReposListLanguagesEndpoint, response: OctokitResponse[ReposListLanguagesResponseData]): ParametersReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListLanguagesEndpoint]
  }
  @scala.inline
  implicit class ParametersReposListLanguagesEndpointOps[Self <: ParametersReposListLanguagesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposListLanguagesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListLanguagesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

