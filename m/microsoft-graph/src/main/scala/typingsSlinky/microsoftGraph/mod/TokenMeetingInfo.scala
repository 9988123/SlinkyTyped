package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenMeetingInfo extends MeetingInfo {
  // The token used to join the call.
  var token: js.UndefOr[String] = js.native
}

object TokenMeetingInfo {
  @scala.inline
  def apply(): TokenMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenMeetingInfo]
  }
  @scala.inline
  implicit class TokenMeetingInfoOps[Self <: TokenMeetingInfo] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

