package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.active
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.cancel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.circle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.complete
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.create
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.point
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchCreateEvent extends js.Object {
  var graphic: Graphic = js.native
  var state: start | active | complete | cancel = js.native
  var tool: point | polyline | polygon | rectangle | circle = js.native
  var toolEventInfo: CreateToolEventInfo = js.native
  var `type`: create = js.native
}

object SketchCreateEvent {
  @scala.inline
  def apply(
    graphic: Graphic,
    state: start | active | complete | cancel,
    tool: point | polyline | polygon | rectangle | circle,
    toolEventInfo: CreateToolEventInfo,
    `type`: create
  ): SketchCreateEvent = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchCreateEvent]
  }
  @scala.inline
  implicit class SketchCreateEventOps[Self <: SketchCreateEvent] (val x: Self) extends AnyVal {
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
    def setGraphic(value: Graphic): Self = this.set("graphic", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: start | active | complete | cancel): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTool(value: point | polyline | polygon | rectangle | circle): Self = this.set("tool", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolEventInfo(value: CreateToolEventInfo): Self = this.set("toolEventInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: create): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

