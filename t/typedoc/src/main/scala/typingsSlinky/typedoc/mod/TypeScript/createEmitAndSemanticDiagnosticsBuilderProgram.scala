package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BuilderProgramHost
import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createEmitAndSemanticDiagnosticsBuilderProgram")
@js.native
object createEmitAndSemanticDiagnosticsBuilderProgram extends js.Object {
  /**
    * Create the builder that can handle the changes in program and iterate through changed files
    * to emit the those files and manage semantic diagnostics cache as well
    */
  def apply(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[js.Array[String]],
    options: js.UndefOr[CompilerOptions],
    host: js.UndefOr[CompilerHost],
    oldProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram],
    configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
    projectReferences: js.UndefOr[js.Array[ProjectReference]]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
}

