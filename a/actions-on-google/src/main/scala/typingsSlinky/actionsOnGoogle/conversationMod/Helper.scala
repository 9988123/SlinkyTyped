package typingsSlinky.actionsOnGoogle.conversationMod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import typingsSlinky.actionsOnGoogle.helperHelperMod.HelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
  extends typingsSlinky.actionsOnGoogle.helperMod.Helper[TIntent, TValueSpec] {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
}

