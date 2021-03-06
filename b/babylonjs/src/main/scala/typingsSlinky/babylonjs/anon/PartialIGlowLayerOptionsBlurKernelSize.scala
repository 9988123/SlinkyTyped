package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Camera
import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IGlowLayerOptions> */
trait PartialIGlowLayerOptionsBlurKernelSize extends js.Object {
  var blurKernelSize: js.UndefOr[Double] = js.undefined
  var camera: js.UndefOr[Nullable[Camera]] = js.undefined
  var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
  var mainTextureRatio: js.UndefOr[Double] = js.undefined
  var mainTextureSamples: js.UndefOr[Double] = js.undefined
  var renderingGroupId: js.UndefOr[Double] = js.undefined
}

object PartialIGlowLayerOptionsBlurKernelSize {
  @scala.inline
  def apply(
    blurKernelSize: js.UndefOr[Double] = js.undefined,
    camera: js.UndefOr[Null | Nullable[Camera]] = js.undefined,
    mainTextureFixedSize: js.UndefOr[Double] = js.undefined,
    mainTextureRatio: js.UndefOr[Double] = js.undefined,
    mainTextureSamples: js.UndefOr[Double] = js.undefined,
    renderingGroupId: js.UndefOr[Double] = js.undefined
  ): PartialIGlowLayerOptionsBlurKernelSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blurKernelSize)) __obj.updateDynamic("blurKernelSize")(blurKernelSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureFixedSize)) __obj.updateDynamic("mainTextureFixedSize")(mainTextureFixedSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureRatio)) __obj.updateDynamic("mainTextureRatio")(mainTextureRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mainTextureSamples)) __obj.updateDynamic("mainTextureSamples")(mainTextureSamples.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderingGroupId)) __obj.updateDynamic("renderingGroupId")(renderingGroupId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIGlowLayerOptionsBlurKernelSize]
  }
}

