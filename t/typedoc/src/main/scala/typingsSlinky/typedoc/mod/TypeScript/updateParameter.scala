package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BindingName
import typingsSlinky.typescript.mod.Decorator
import typingsSlinky.typescript.mod.DotDotDotToken
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Modifier
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.QuestionToken
import typingsSlinky.typescript.mod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateParameter")
@js.native
object updateParameter extends js.Object {
  def apply(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
}

