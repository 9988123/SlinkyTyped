package typingsSlinky.reactMapGl.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactMapGl.mod.MapContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Consumer {
  @JSImport("react-map-gl", "_MapContext.Consumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ConsumerProps[MapContextProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: MapContextProps => ReactElement): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[MapContextProps]]))
  }
}

