package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.mlParserAstMod.Node
import typingsSlinky.angularCompiler.mlParserAstMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "visitAll")
@js.native
object visitAll extends js.Object {
  def apply(visitor: Visitor, nodes: js.Array[Node]): js.Array[_] = js.native
  def apply(visitor: Visitor, nodes: js.Array[Node], context: js.Any): js.Array[_] = js.native
}

