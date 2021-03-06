package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPullRequestReviewProtectionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetPullRequestReviewProtectionEndpoint extends js.Object {
  var parameters: ReposGetPullRequestReviewProtectionEndpoint = js.native
  var request: ReposGetPullRequestReviewProtectionRequestOptions = js.native
  var response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData] = js.native
}

object ParametersReposGetPullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetPullRequestReviewProtectionEndpoint,
    request: ReposGetPullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]
  ): ParametersReposGetPullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPullRequestReviewProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetPullRequestReviewProtectionEndpointOps[Self <: ParametersReposGetPullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetPullRequestReviewProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetPullRequestReviewProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPullRequestReviewProtectionResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

