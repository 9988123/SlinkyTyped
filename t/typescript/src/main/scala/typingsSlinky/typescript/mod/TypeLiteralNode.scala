package typingsSlinky.typescript.mod

import typingsSlinky.typescript.mod.SyntaxKind.TypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typescript.mod.TextRange because Already inherited
- typingsSlinky.typescript.mod.Node because Already inherited
- typingsSlinky.typescript.mod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait TypeLiteralNode
  extends TypeNode
     with ObjectTypeDeclaration {
  var _declarationBrand: js.Any = js.native
  @JSName("kind")
  var kind_TypeLiteralNode: TypeLiteral = js.native
  var members: NodeArray[TypeElement] = js.native
}

