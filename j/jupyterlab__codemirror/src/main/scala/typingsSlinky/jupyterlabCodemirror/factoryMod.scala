package typingsSlinky.jupyterlabCodemirror

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import typingsSlinky.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typingsSlinky.jupyterlabCodemirror.anon.PartialIConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory () extends IEditorFactoryService {
    def this(defaults: PartialIConfig) = this()
    var documentCodeMirrorConfig: PartialIConfig = js.native
    var inlineCodeMirrorConfig: PartialIConfig = js.native
    /**
      * Create a new editor for a full document.
      */
    /* CompleteClass */
    override def newDocumentEditor(options: IOptions): IEditor = js.native
    /**
      * Create a new editor for inline code.
      */
    /* CompleteClass */
    override def newInlineEditor(options: IOptions): IEditor = js.native
  }
  
}

