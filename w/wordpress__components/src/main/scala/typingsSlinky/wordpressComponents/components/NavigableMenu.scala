package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigableMenu {
  @JSImport("@wordpress/components/navigable-container", "NavigableMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props1826070444[HTMLDivElement] = new SharedBuilder_Props1826070444[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavigableMenu.type): SharedBuilder_Props1826070444[HTMLDivElement] = new SharedBuilder_Props1826070444[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}

