package typingsSlinky.jupyterlabCodemirror.syntaxstatusMod

import typingsSlinky.jupyterlabApputils.vdomMod.VDomRenderer
import typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.IOptions
import typingsSlinky.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus")
@js.native
class EditorSyntaxStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct a new VDomRenderer for the status item.
    */
  def this(opts: IOptions) = this()
  var _commands: js.Any = js.native
  /**
    * Create a menu for selecting the mode of the editor.
    */
  var _handleClick: js.Any = js.native
  var _popup: js.Any = js.native
}

