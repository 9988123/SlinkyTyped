package typingsSlinky.reactDraggable.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDraggable.anon.PartialDraggableProps
import typingsSlinky.reactDraggable.mod.ControlPosition
import typingsSlinky.reactDraggable.mod.DraggableBounds
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.mod.PositionOffsetControlPosition
import typingsSlinky.reactDraggable.mod.default
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactDraggable.reactDraggableStrings.both
import typingsSlinky.reactDraggable.reactDraggableStrings.none
import typingsSlinky.reactDraggable.reactDraggableStrings.x
import typingsSlinky.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDraggable {
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def allowAnyClick(value: Boolean): this.type = set("allowAnyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def axis(value: both | x | y | none): this.type = set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def bounds(value: DraggableBounds | String | `false`): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def cancel(value: String): this.type = set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultClassName(value: String): this.type = set("defaultClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultClassNameDragged(value: String): this.type = set("defaultClassNameDragged", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultClassNameDragging(value: String): this.type = set("defaultClassNameDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPosition(value: ControlPosition): this.type = set("defaultPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def enableUserSelectHack(value: Boolean): this.type = set("enableUserSelectHack", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def handle(value: String): this.type = set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def nodeRef(value: ReactRef[HTMLElement]): this.type = set("nodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetParent(value: HTMLElement): this.type = set("offsetParent", value.asInstanceOf[js.Any])
    @scala.inline
    def onDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseDown(value: /* e */ MouseEvent => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def onStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def onStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): this.type = set("onStop", js.Any.fromFunction2(value))
    @scala.inline
    def position(value: ControlPosition): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def positionOffset(value: PositionOffsetControlPosition): this.type = set("positionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialDraggableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactDraggable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

