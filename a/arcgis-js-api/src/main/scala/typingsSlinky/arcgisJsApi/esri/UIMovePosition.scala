package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.manual
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIMovePosition extends Object {
  /**
    * The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var position: js.UndefOr[
    `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ] = js.native
}

object UIMovePosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): UIMovePosition = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[UIMovePosition]
  }
  @scala.inline
  implicit class UIMovePositionOps[Self <: UIMovePosition] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPosition(
      value: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

