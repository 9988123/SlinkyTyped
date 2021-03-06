package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DidChangeWatchedFilesNotification")
@js.native
object DidChangeWatchedFilesNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}

