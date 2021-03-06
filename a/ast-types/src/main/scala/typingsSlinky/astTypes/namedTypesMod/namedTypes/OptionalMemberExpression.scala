package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type'> */
trait OptionalMemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `object`: ExpressionKind
  var optional: js.UndefOr[Boolean] = js.undefined
  var property: IdentifierKind | ExpressionKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalMemberExpression")
@js.native
object OptionalMemberExpression extends TopLevel[Type[OptionalMemberExpression]]

