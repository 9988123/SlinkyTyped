package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typingsSlinky.sipJs.coreMod.ReSubscribeUserAgentClient {
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog) = this()
  def this(dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

