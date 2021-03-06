package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
class IndexMemberDeclarationSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.IndexMemberDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    indexSignature: typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "IndexMemberDeclarationSyntax")
@js.native
object IndexMemberDeclarationSyntax extends js.Object {
  def create(
    indexSignature: typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax,
    semicolonToken: ISyntaxToken
  ): typingsSlinky.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
  def create1(indexSignature: typingsSlinky.typescriptServices.TypeScript.IndexSignatureSyntax): typingsSlinky.typescriptServices.TypeScript.IndexMemberDeclarationSyntax = js.native
}

