package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ModuleSpecifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpecifierKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> */
trait ImportNamespaceSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var local: js.UndefOr[IdentifierKind] = js.undefined
  var name: js.UndefOr[IdentifierKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ImportNamespaceSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportNamespaceSpecifier")
@js.native
object ImportNamespaceSpecifier extends TopLevel[Type[ImportNamespaceSpecifier]]

