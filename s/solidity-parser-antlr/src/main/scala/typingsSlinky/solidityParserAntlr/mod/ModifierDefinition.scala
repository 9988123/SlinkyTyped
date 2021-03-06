package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifierDefinition
  extends BaseASTNode
     with ASTNode {
  var name: String = js.native
  @JSName("type")
  var type_ModifierDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition = js.native
}

object ModifierDefinition {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition
  ): ModifierDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierDefinition]
  }
  @scala.inline
  implicit class ModifierDefinitionOps[Self <: ModifierDefinition] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ModifierDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

