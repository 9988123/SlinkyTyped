package typingsSlinky.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensEditsPartialResult extends js.Object {
  var edits: js.Array[SemanticTokensEdit] = js.native
}

object SemanticTokensEditsPartialResult {
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensEditsPartialResult = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsPartialResult]
  }
  @scala.inline
  implicit class SemanticTokensEditsPartialResultOps[Self <: SemanticTokensEditsPartialResult] (val x: Self) extends AnyVal {
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
    def setEditsVarargs(value: SemanticTokensEdit*): Self = this.set("edits", js.Array(value :_*))
    @scala.inline
    def setEdits(value: js.Array[SemanticTokensEdit]): Self = this.set("edits", value.asInstanceOf[js.Any])
  }
  
}

