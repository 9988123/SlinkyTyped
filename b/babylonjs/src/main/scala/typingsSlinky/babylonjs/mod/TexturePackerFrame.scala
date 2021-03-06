package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "TexturePackerFrame")
@js.native
class TexturePackerFrame protected ()
  extends typingsSlinky.babylonjs.legacyMod.TexturePackerFrame {
  /**
    * Initializes a texture package frame.
    * @param id The numerical frame identifier
    * @param scale Scalar Vector2 for UV frame
    * @param offset Vector2 for the frame position in UV units.
    * @returns TexturePackerFrame
    */
  def this(
    id: Double,
    scale: typingsSlinky.babylonjs.mathVectorMod.Vector2,
    offset: typingsSlinky.babylonjs.mathVectorMod.Vector2
  ) = this()
}

