package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "InitializedNotification")
@js.native
object InitializedNotification extends js.Object {
  val `type`: ProtocolNotificationType[InitializedParams, Unit] = js.native
}

