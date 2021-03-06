package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingParticipantInfo extends js.Object {
  // Identity information of the participant.
  var identity: js.UndefOr[IdentitySet] = js.native
  // User principal name of the participant.
  var upn: js.UndefOr[String] = js.native
}

object MeetingParticipantInfo {
  @scala.inline
  def apply(): MeetingParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingParticipantInfo]
  }
  @scala.inline
  implicit class MeetingParticipantInfoOps[Self <: MeetingParticipantInfo] (val x: Self) extends AnyVal {
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
    def setIdentity(value: IdentitySet): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    @scala.inline
    def setUpn(value: String): Self = this.set("upn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpn: Self = this.set("upn", js.undefined)
  }
  
}

