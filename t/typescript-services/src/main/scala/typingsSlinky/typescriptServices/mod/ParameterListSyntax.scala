package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParameterListSyntax")
@js.native
class ParameterListSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax {
  def this(
    openParenToken: ISyntaxToken,
    parameters: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ParameterListSyntax")
@js.native
object ParameterListSyntax extends js.Object {
  def create(openParenToken: ISyntaxToken, closeParenToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ParameterListSyntax = js.native
}

