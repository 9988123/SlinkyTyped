package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsSlinky.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait MarkerProps
  extends MarkerOptions
     with MarkerEvents {
  var children: js.UndefOr[Children] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var position: LatLngExpression = js.native
}

object MarkerProps {
  @scala.inline
  def apply(position: LatLngExpression): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
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
    def setPosition(value: LatLngExpression): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
  }
  
}

