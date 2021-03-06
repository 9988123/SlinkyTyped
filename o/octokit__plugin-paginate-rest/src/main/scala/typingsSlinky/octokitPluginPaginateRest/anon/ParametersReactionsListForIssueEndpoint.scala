package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReactionsListForIssueEndpoint extends js.Object {
  var parameters: ReactionsListForIssueEndpoint = js.native
  var response: OctokitResponse[ReactionsListForIssueResponseData] = js.native
}

object ParametersReactionsListForIssueEndpoint {
  @scala.inline
  def apply(
    parameters: ReactionsListForIssueEndpoint,
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): ParametersReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForIssueEndpoint]
  }
  @scala.inline
  implicit class ParametersReactionsListForIssueEndpointOps[Self <: ParametersReactionsListForIssueEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReactionsListForIssueEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

