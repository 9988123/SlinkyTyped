package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ImportKind
import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDeclarationBuilder extends js.Object {
  def apply(
    specifiers: js.UndefOr[
      js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
    ],
    source: LiteralKind
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.UndefOr[
      js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
    ],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.UndefOr[
      js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
    ],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  def from(params: ImportKind): ImportDeclaration = js.native
}

