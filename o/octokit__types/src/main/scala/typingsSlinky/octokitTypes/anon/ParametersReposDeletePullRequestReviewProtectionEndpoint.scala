package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeletePullRequestReviewProtectionRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposDeletePullRequestReviewProtectionEndpoint extends js.Object {
  var parameters: ReposDeletePullRequestReviewProtectionEndpoint = js.native
  var request: ReposDeletePullRequestReviewProtectionRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersReposDeletePullRequestReviewProtectionEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeletePullRequestReviewProtectionEndpoint,
    request: ReposDeletePullRequestReviewProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeletePullRequestReviewProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeletePullRequestReviewProtectionEndpoint]
  }
  @scala.inline
  implicit class ParametersReposDeletePullRequestReviewProtectionEndpointOps[Self <: ParametersReposDeletePullRequestReviewProtectionEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposDeletePullRequestReviewProtectionEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposDeletePullRequestReviewProtectionRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

