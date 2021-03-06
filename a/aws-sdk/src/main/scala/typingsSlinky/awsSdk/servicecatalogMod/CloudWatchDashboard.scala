package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDashboard extends js.Object {
  /**
    * The name of the CloudWatch dashboard.
    */
  var Name: js.UndefOr[CloudWatchDashboardName] = js.native
}

object CloudWatchDashboard {
  @scala.inline
  def apply(): CloudWatchDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchDashboard]
  }
  @scala.inline
  implicit class CloudWatchDashboardOps[Self <: CloudWatchDashboard] (val x: Self) extends AnyVal {
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
    def setName(value: CloudWatchDashboardName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

