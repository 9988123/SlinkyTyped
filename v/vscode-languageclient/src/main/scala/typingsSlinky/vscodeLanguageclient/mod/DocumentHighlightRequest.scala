package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentHighlightRequest")
@js.native
object DocumentHighlightRequest extends js.Object {
  val method: textDocumentSlashdocumentHighlight = js.native
  /** @deprecated Use DocumentHighlightRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight]] = js.native
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}

