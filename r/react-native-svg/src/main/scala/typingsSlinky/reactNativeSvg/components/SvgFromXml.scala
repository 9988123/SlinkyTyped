package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.XmlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SvgFromXml {
  @JSImport("react-native-svg", "SvgFromXml")
  @js.native
  object component extends js.Object
  
  def withProps(p: XmlProps): SharedBuilder_XmlProps_304989786 = new SharedBuilder_XmlProps_304989786(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SvgFromXml.type): SharedBuilder_XmlProps_304989786 = new SharedBuilder_XmlProps_304989786(js.Array(this.component, js.Dictionary.empty))()
}

