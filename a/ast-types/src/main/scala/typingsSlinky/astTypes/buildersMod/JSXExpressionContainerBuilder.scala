package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Expression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXExpressionContainerBuilder extends js.Object {
  def apply(expression: ExpressionKind): JSXExpressionContainer = js.native
  def from(params: Expression): JSXExpressionContainer = js.native
}

