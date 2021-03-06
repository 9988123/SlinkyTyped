package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstancesResult extends js.Object {
  /**
    * Information about the stopped instances.
    */
  var StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object StopInstancesResult {
  @scala.inline
  def apply(): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopInstancesResult]
  }
  @scala.inline
  implicit class StopInstancesResultOps[Self <: StopInstancesResult] (val x: Self) extends AnyVal {
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
    def setStoppingInstancesVarargs(value: InstanceStateChange*): Self = this.set("StoppingInstances", js.Array(value :_*))
    @scala.inline
    def setStoppingInstances(value: InstanceStateChangeList): Self = this.set("StoppingInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppingInstances: Self = this.set("StoppingInstances", js.undefined)
  }
  
}

