package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.LinesMesh
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsInstance extends js.Object {
  var colors: js.UndefOr[js.Array[Color4]] = js.undefined
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  var points: js.Array[Vector3]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object ColorsInstance {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    colors: js.Array[Color4] = null,
    instance: js.UndefOr[Null | Nullable[LinesMesh]] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): ColorsInstance = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsInstance]
  }
}

