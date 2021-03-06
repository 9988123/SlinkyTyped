package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersPullsListReviewCommentsForRepoEndpoint extends js.Object {
  var parameters: PullsListReviewCommentsForRepoEndpoint = js.native
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData] = js.native
}

object ParametersPullsListReviewCommentsForRepoEndpoint {
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsForRepoEndpoint,
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): ParametersPullsListReviewCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsForRepoEndpoint]
  }
  @scala.inline
  implicit class ParametersPullsListReviewCommentsForRepoEndpointOps[Self <: ParametersPullsListReviewCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: PullsListReviewCommentsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewCommentsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

