package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// channelGroups
@js.native
trait ChannelGroups extends js.Object {
  def addChannels(params: AddChannelParameters): js.Promise[js.Object] = js.native
  def addChannels(params: AddChannelParameters, callback: StatusCallback): Unit = js.native
  def deleteGroup(params: DeleteGroupParameters): js.Promise[js.Object] = js.native
  def deleteGroup(params: DeleteGroupParameters, callback: StatusCallback): Unit = js.native
  def listChannels(params: ListChannelsParameters): js.Promise[ListChannelsResponse] = js.native
  def listChannels(params: ListChannelsParameters, callback: Callback[ListChannelsResponse]): Unit = js.native
  def listGroups(): js.Promise[ListAllGroupsResponse] = js.native
  def listGroups(callback: Callback[ListAllGroupsResponse]): Unit = js.native
  def removeChannels(params: RemoveChannelParameters): js.Promise[js.Object] = js.native
  def removeChannels(params: RemoveChannelParameters, callback: StatusCallback): Unit = js.native
}

