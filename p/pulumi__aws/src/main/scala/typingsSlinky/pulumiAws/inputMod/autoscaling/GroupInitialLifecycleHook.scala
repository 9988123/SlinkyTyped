package typingsSlinky.pulumiAws.inputMod.autoscaling

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupInitialLifecycleHook extends js.Object {
  var defaultResult: js.UndefOr[Input[String]] = js.native
  var heartbeatTimeout: js.UndefOr[Input[Double]] = js.native
  var lifecycleTransition: Input[String] = js.native
  /**
    * The name of the auto scaling group. By default generated by this provider.
    */
  var name: Input[String] = js.native
  var notificationMetadata: js.UndefOr[Input[String]] = js.native
  var notificationTargetArn: js.UndefOr[Input[String]] = js.native
  var roleArn: js.UndefOr[Input[String]] = js.native
}

object GroupInitialLifecycleHook {
  @scala.inline
  def apply(lifecycleTransition: Input[String], name: Input[String]): GroupInitialLifecycleHook = {
    val __obj = js.Dynamic.literal(lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupInitialLifecycleHook]
  }
  @scala.inline
  implicit class GroupInitialLifecycleHookOps[Self <: GroupInitialLifecycleHook] (val x: Self) extends AnyVal {
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
    def setLifecycleTransition(value: Input[String]): Self = this.set("lifecycleTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultResult(value: Input[String]): Self = this.set("defaultResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultResult: Self = this.set("defaultResult", js.undefined)
    @scala.inline
    def setHeartbeatTimeout(value: Input[Double]): Self = this.set("heartbeatTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("heartbeatTimeout", js.undefined)
    @scala.inline
    def setNotificationMetadata(value: Input[String]): Self = this.set("notificationMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationMetadata: Self = this.set("notificationMetadata", js.undefined)
    @scala.inline
    def setNotificationTargetArn(value: Input[String]): Self = this.set("notificationTargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTargetArn: Self = this.set("notificationTargetArn", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

