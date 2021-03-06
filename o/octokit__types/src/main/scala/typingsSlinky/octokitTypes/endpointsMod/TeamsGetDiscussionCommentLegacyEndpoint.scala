package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsGetDiscussionCommentLegacyEndpoint extends js.Object {
  var comment_number: Double = js.native
  var discussion_number: Double = js.native
  var team_id: Double = js.native
}

object TeamsGetDiscussionCommentLegacyEndpoint {
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, team_id: Double): TeamsGetDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetDiscussionCommentLegacyEndpoint]
  }
  @scala.inline
  implicit class TeamsGetDiscussionCommentLegacyEndpointOps[Self <: TeamsGetDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setComment_number(value: Double): Self = this.set("comment_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscussion_number(value: Double): Self = this.set("discussion_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam_id(value: Double): Self = this.set("team_id", value.asInstanceOf[js.Any])
  }
  
}

