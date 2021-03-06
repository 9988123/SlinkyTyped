package typingsSlinky.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEc2TagSet extends js.Object {
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  var ec2TagFilters: js.UndefOr[js.Array[DeploymentGroupEc2TagSetEc2TagFilter]] = js.native
}

object DeploymentGroupEc2TagSet {
  @scala.inline
  def apply(): DeploymentGroupEc2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupEc2TagSet]
  }
  @scala.inline
  implicit class DeploymentGroupEc2TagSetOps[Self <: DeploymentGroupEc2TagSet] (val x: Self) extends AnyVal {
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
    def setEc2TagFiltersVarargs(value: DeploymentGroupEc2TagSetEc2TagFilter*): Self = this.set("ec2TagFilters", js.Array(value :_*))
    @scala.inline
    def setEc2TagFilters(value: js.Array[DeploymentGroupEc2TagSetEc2TagFilter]): Self = this.set("ec2TagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2TagFilters: Self = this.set("ec2TagFilters", js.undefined)
  }
  
}

