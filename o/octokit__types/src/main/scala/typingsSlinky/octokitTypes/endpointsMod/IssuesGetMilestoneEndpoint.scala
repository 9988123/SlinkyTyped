package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesGetMilestoneEndpoint extends js.Object {
  var milestone_number: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object IssuesGetMilestoneEndpoint {
  @scala.inline
  def apply(milestone_number: Double, owner: String, repo: String): IssuesGetMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetMilestoneEndpoint]
  }
  @scala.inline
  implicit class IssuesGetMilestoneEndpointOps[Self <: IssuesGetMilestoneEndpoint] (val x: Self) extends AnyVal {
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
    def setMilestone_number(value: Double): Self = this.set("milestone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

