package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object CircleMarker {
  @JSImport("react-leaflet", "CircleMarker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeaflet.mod.AttributionControlProps */ P, /* <: typingsSlinky.leaflet.mod.Control_.Attribution */ E] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.CircleMarker[P, E]]
  
  def apply[/* <: typingsSlinky.reactLeaflet.mod.CircleMarkerProps */ P, /* <: typingsSlinky.leaflet.mod.CircleMarker_[js.Any] */ E](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeaflet.mod.CircleMarkerProps */ P, /* <: typingsSlinky.leaflet.mod.CircleMarker_[js.Any] */ E](companion: CircleMarker.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

