package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> */
trait StringLiteral extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var regex: js.UndefOr[Flags] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
}

