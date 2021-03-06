package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsSlinky.angularCompiler.compilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typingsSlinky.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typingsSlinky.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

