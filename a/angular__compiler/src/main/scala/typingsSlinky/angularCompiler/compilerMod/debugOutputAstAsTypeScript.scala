package typingsSlinky.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "debugOutputAstAsTypeScript")
@js.native
object debugOutputAstAsTypeScript extends js.Object {
  def apply(ast: js.Array[_]): String = js.native
  def apply(ast: typingsSlinky.angularCompiler.outputAstMod.Expression): String = js.native
  def apply(ast: typingsSlinky.angularCompiler.outputAstMod.Statement): String = js.native
  def apply(ast: typingsSlinky.angularCompiler.outputAstMod.Type): String = js.native
}

