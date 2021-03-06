package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExpressionSyntax
  extends IPrimaryExpressionSyntax
     with SyntaxNode {
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var functionKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  def withBlock(block: BlockSyntax): FunctionExpressionSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionExpressionSyntax = js.native
  def withFunctionKeyword(functionKeyword: ISyntaxToken): FunctionExpressionSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): FunctionExpressionSyntax = js.native
}

