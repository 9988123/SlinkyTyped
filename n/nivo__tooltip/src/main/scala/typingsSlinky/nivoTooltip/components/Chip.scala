package typingsSlinky.nivoTooltip.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoTooltip.anon.PartialCSSProperties
import typingsSlinky.nivoTooltip.mod.ChipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Chip {
  @JSImport("@nivo/tooltip", "Chip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoTooltip.mod.Chip] {
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: PartialCSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ChipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(color: String): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChipProps]))
  }
}

