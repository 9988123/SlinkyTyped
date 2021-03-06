package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "RotationGizmo")
@js.native
/**
  * Creates a RotationGizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  * @param tessellation Amount of tessellation to be used when creating rotation circles
  * @param useEulerRotation Use and update Euler angle instead of quaternion
  */
class RotationGizmo ()
  extends typingsSlinky.babylonjs.legacyMod.RotationGizmo {
  def this(gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer) = this()
  def this(
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double
  ) = this()
  def this(
    gizmoLayer: typingsSlinky.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double,
    useEulerRotation: Boolean
  ) = this()
}

