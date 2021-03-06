package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Test
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoWhileStatementBuilder extends js.Object {
  def apply(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  def from(params: Test): DoWhileStatement = js.native
}

