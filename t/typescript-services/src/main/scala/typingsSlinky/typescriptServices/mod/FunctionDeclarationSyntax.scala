package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
class FunctionDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typingsSlinky.typescriptServices.TypeScript.BlockSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "FunctionDeclarationSyntax")
@js.native
object FunctionDeclarationSyntax extends js.Object {
  def create(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: typingsSlinky.typescriptServices.TypeScript.CallSignatureSyntax
  ): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.FunctionDeclarationSyntax = js.native
}

