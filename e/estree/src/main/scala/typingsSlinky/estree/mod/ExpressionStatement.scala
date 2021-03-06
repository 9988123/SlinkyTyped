package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatement
  extends BaseNode
     with Statement {
  var expression: Expression = js.native
  @JSName("type")
  var type_ExpressionStatement: typingsSlinky.estree.estreeStrings.ExpressionStatement = js.native
}

object ExpressionStatement {
  @scala.inline
  def apply(expression: Expression, `type`: typingsSlinky.estree.estreeStrings.ExpressionStatement): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement]
  }
  @scala.inline
  implicit class ExpressionStatementOps[Self <: ExpressionStatement] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ExpressionStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

