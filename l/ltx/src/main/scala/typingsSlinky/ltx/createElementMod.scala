package typingsSlinky.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ltx.elementMod.Element
import typingsSlinky.ltx.elementMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/createElement", JSImport.Namespace)
@js.native
object createElementMod extends js.Object {
  def createElement(name: String, attrs: js.UndefOr[scala.Nothing], children: Node*): Element = js.native
  def createElement(name: String, attrs: String, children: Node*): Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): Element = js.native
}

