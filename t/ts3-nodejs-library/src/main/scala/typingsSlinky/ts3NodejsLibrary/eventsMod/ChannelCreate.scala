package typingsSlinky.ts3NodejsLibrary.eventsMod

import typingsSlinky.std.Record
import typingsSlinky.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typingsSlinky.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCreate extends js.Object {
  var channel: TeamSpeakChannel = js.native
  var cpid: Double = js.native
  var invoker: TeamSpeakClient = js.native
  var modified: Record[String, _] = js.native
}

object ChannelCreate {
  @scala.inline
  def apply(channel: TeamSpeakChannel, cpid: Double, invoker: TeamSpeakClient, modified: Record[String, _]): ChannelCreate = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCreate]
  }
  @scala.inline
  implicit class ChannelCreateOps[Self <: ChannelCreate] (val x: Self) extends AnyVal {
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
    def setChannel(value: TeamSpeakChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpid(value: Double): Self = this.set("cpid", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoker(value: TeamSpeakClient): Self = this.set("invoker", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: Record[String, _]): Self = this.set("modified", value.asInstanceOf[js.Any])
  }
  
}

