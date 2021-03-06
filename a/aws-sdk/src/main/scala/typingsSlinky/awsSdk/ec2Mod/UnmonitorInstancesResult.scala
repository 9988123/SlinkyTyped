package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmonitorInstancesResult extends js.Object {
  /**
    * The monitoring information.
    */
  var InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.native
}

object UnmonitorInstancesResult {
  @scala.inline
  def apply(): UnmonitorInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmonitorInstancesResult]
  }
  @scala.inline
  implicit class UnmonitorInstancesResultOps[Self <: UnmonitorInstancesResult] (val x: Self) extends AnyVal {
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
    def setInstanceMonitoringsVarargs(value: InstanceMonitoring*): Self = this.set("InstanceMonitorings", js.Array(value :_*))
    @scala.inline
    def setInstanceMonitorings(value: InstanceMonitoringList): Self = this.set("InstanceMonitorings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceMonitorings: Self = this.set("InstanceMonitorings", js.undefined)
  }
  
}

