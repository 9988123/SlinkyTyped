package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.IdentiferNameHashTable
import typingsSlinky.typescriptServices.TypeScript.Services.CachedCompletionEntryDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CompletionSession")
@js.native
class CompletionSession protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CompletionSession {
  def this(fileName: String, position: Double, entries: IdentiferNameHashTable[CachedCompletionEntryDetails]) = this()
}

