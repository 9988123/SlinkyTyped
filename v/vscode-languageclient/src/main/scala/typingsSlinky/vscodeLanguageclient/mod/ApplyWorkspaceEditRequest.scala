package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ApplyWorkspaceEditRequest")
@js.native
object ApplyWorkspaceEditRequest extends js.Object {
  val `type`: ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResponse, scala.Nothing, Unit, Unit] = js.native
}

