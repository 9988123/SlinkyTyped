package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateCommitCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateCommitCommentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateCommitCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposUpdateCommitCommentEndpoint extends js.Object {
  var parameters: ReposUpdateCommitCommentEndpoint = js.native
  var request: ReposUpdateCommitCommentRequestOptions = js.native
  var response: OctokitResponse[ReposUpdateCommitCommentResponseData] = js.native
}

object ParametersReposUpdateCommitCommentEndpoint {
  @scala.inline
  def apply(
    parameters: ReposUpdateCommitCommentEndpoint,
    request: ReposUpdateCommitCommentRequestOptions,
    response: OctokitResponse[ReposUpdateCommitCommentResponseData]
  ): ParametersReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateCommitCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersReposUpdateCommitCommentEndpointOps[Self <: ParametersReposUpdateCommitCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposUpdateCommitCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposUpdateCommitCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateCommitCommentResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

