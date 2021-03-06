package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsDeleteReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsDeleteReviewCommentRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsDeleteReviewCommentEndpoint extends js.Object {
  var parameters: PullsDeleteReviewCommentEndpoint = js.native
  var request: PullsDeleteReviewCommentRequestOptions = js.native
  var response: OctokitResponse[_] = js.native
}

object ParametersPullsDeleteReviewCommentEndpoint {
  @scala.inline
  def apply(
    parameters: PullsDeleteReviewCommentEndpoint,
    request: PullsDeleteReviewCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersPullsDeleteReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsDeleteReviewCommentEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsDeleteReviewCommentEndpointOps[Self <: ParametersPullsDeleteReviewCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsDeleteReviewCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PullsDeleteReviewCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

