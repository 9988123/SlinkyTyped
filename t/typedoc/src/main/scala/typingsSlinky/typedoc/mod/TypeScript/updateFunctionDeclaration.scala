package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.AsteriskToken
import typingsSlinky.typescript.mod.Block
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.FunctionDeclaration
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.TypeNode
import typingsSlinky.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateFunctionDeclaration")
@js.native
object updateFunctionDeclaration extends js.Object {
  def apply(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
}

