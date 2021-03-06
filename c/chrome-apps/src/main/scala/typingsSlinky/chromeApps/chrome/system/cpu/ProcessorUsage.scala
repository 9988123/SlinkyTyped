package typingsSlinky.chromeApps.chrome.system.cpu

import typingsSlinky.chromeApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorUsage extends js.Object {
  /** The cumulative time spent idle by this processor. */
  var idle: double = js.native
  /** The cumulative time used by kernel programs on this processor. */
  var kernel: double = js.native
  /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
  var total: double = js.native
  /** The cumulative time used by userspace programs on this processor. */
  var user: double = js.native
}

object ProcessorUsage {
  @scala.inline
  def apply(idle: double, kernel: double, total: double, user: double): ProcessorUsage = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorUsage]
  }
  @scala.inline
  implicit class ProcessorUsageOps[Self <: ProcessorUsage] (val x: Self) extends AnyVal {
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
    def setIdle(value: double): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernel(value: double): Self = this.set("kernel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: double): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

