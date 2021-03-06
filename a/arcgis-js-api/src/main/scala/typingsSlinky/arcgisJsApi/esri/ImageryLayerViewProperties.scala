package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryLayerViewProperties extends LayerViewProperties {
  /**
    * An object that provides the user access to [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) and their values in the layer. See the object specifications table below for details about each property. This object is used as input in the [pixelFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter) function for filtering and processing each pixel in the block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelData: js.UndefOr[ImageryLayerViewPixelData] = js.native
}

object ImageryLayerViewProperties {
  @scala.inline
  def apply(): ImageryLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryLayerViewProperties]
  }
  @scala.inline
  implicit class ImageryLayerViewPropertiesOps[Self <: ImageryLayerViewProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPixelData(value: ImageryLayerViewPixelData): Self = this.set("pixelData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelData: Self = this.set("pixelData", js.undefined)
  }
  
}

