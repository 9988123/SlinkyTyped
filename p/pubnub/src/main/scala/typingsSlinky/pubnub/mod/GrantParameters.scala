package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// grant
@js.native
trait GrantParameters extends js.Object {
  var authKeys: js.UndefOr[js.Array[String]] = js.native
  var channelGroups: js.UndefOr[js.Array[String]] = js.native
  var channels: js.UndefOr[js.Array[String]] = js.native
  var manage: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var write: js.UndefOr[Boolean] = js.native
}

object GrantParameters {
  @scala.inline
  def apply(): GrantParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantParameters]
  }
  @scala.inline
  implicit class GrantParametersOps[Self <: GrantParameters] (val x: Self) extends AnyVal {
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
    def setAuthKeysVarargs(value: String*): Self = this.set("authKeys", js.Array(value :_*))
    @scala.inline
    def setAuthKeys(value: js.Array[String]): Self = this.set("authKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthKeys: Self = this.set("authKeys", js.undefined)
    @scala.inline
    def setChannelGroupsVarargs(value: String*): Self = this.set("channelGroups", js.Array(value :_*))
    @scala.inline
    def setChannelGroups(value: js.Array[String]): Self = this.set("channelGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelGroups: Self = this.set("channelGroups", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setManage(value: Boolean): Self = this.set("manage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManage: Self = this.set("manage", js.undefined)
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

