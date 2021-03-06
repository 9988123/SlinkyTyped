package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingLogs extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
}

object PendingLogs {
  @scala.inline
  def apply(): PendingLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingLogs]
  }
  @scala.inline
  implicit class PendingLogsOps[Self <: PendingLogs] (val x: Self) extends AnyVal {
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
    def setAudit(value: boolean): Self = this.set("Audit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudit: Self = this.set("Audit", js.undefined)
    @scala.inline
    def setGeneral(value: boolean): Self = this.set("General", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneral: Self = this.set("General", js.undefined)
  }
  
}

