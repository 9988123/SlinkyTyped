package typingsSlinky.reactCollapse.components

import typingsSlinky.reactCollapse.mod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UnmountClosed {
  @JSImport("react-collapse", "UnmountClosed")
  @js.native
  object component extends js.Object
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps301323921[typingsSlinky.reactCollapse.mod.UnmountClosed] = new SharedBuilder_CollapseProps301323921[typingsSlinky.reactCollapse.mod.UnmountClosed](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpened: Boolean): SharedBuilder_CollapseProps301323921[typingsSlinky.reactCollapse.mod.UnmountClosed] = {
    val __props = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
    new SharedBuilder_CollapseProps301323921[typingsSlinky.reactCollapse.mod.UnmountClosed](js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
}

