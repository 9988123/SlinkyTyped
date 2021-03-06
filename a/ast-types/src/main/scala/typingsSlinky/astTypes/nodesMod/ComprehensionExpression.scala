package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait ComprehensionExpression extends ASTNode {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var filter: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression
}

object ComprehensionExpression {
  @scala.inline
  def apply(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression,
    comments: js.Array[CommentKind] = null,
    filter: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComprehensionExpression]
  }
}

