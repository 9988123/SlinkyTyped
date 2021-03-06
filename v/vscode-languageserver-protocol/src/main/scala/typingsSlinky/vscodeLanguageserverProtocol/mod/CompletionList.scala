package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionList")
@js.native
object CompletionList extends js.Object {
  /**
    * Creates a new completion list.
    *
    * @param items The completion items.
    * @param isIncomplete The list is not complete.
    */
  def create(): typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.UndefOr[scala.Nothing], isIncomplete: Boolean): typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem]): typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList = js.native
  def create(items: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem], isIncomplete: Boolean): typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList = js.native
}

