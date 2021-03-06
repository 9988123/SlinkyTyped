package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLaunchTemplatesResult extends js.Object {
  /**
    * Information about the launch templates.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLaunchTemplatesResult {
  @scala.inline
  def apply(): DescribeLaunchTemplatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplatesResult]
  }
  @scala.inline
  implicit class DescribeLaunchTemplatesResultOps[Self <: DescribeLaunchTemplatesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLaunchTemplatesVarargs(value: LaunchTemplate*): Self = this.set("LaunchTemplates", js.Array(value :_*))
    @scala.inline
    def setLaunchTemplates(value: LaunchTemplateSet): Self = this.set("LaunchTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplates: Self = this.set("LaunchTemplates", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

