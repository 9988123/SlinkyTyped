package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typingsSlinky.babylonjs.BABYLON.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsSlinky.babylonjs.BABYLON.Vector3,
    color: typingsSlinky.babylonjs.BABYLON.Color3,
    gizmoLayer: typingsSlinky.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typingsSlinky.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.PlaneDragGizmo")
@js.native
object PlaneDragGizmo extends js.Object {
  /** @hidden */
  def _CreateArrowInstance(scene: typingsSlinky.babylonjs.BABYLON.Scene, arrow: typingsSlinky.babylonjs.BABYLON.TransformNode): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
  /** @hidden */
  def _CreatePlane(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    material: typingsSlinky.babylonjs.BABYLON.StandardMaterial
  ): typingsSlinky.babylonjs.BABYLON.TransformNode = js.native
}

