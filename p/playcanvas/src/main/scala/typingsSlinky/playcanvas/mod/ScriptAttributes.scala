package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.anon.TypeofScriptType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container of Script Attribute definitions. Implements an interface to add/remove attributes and store their definition for a {@link pc.ScriptType}.
  * Note: An instance of pc.ScriptAttributes is created automatically by each {@link pc.ScriptType}.
  * @param scriptType - Script Type that attributes relate to.
  */
@JSImport("playcanvas", "ScriptAttributes")
@js.native
class ScriptAttributes protected ()
  extends typingsSlinky.playcanvas.pc.ScriptAttributes {
  def this(scriptType: TypeofScriptType) = this()
}

