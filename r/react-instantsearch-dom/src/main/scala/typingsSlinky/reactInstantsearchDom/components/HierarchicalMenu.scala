package typingsSlinky.reactInstantsearchDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object HierarchicalMenu {
  @JSImport("react-instantsearch-dom", "HierarchicalMenu")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.HierarchicalMenu] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.HierarchicalMenu](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HierarchicalMenu.type): Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.HierarchicalMenu] = new Default[tag.type, typingsSlinky.reactInstantsearchDom.mod.HierarchicalMenu](js.Array(this.component, js.Dictionary.empty))()
}

