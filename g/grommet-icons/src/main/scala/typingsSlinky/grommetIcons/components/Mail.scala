package typingsSlinky.grommetIcons.components

import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.grommetIcons.iconsMod.IconProps
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mail {
  @JSImport("grommet-icons/es6", "Mail")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps with SVGProps[SVGSVGElement]): SharedBuilder_IconPropsSVGProps443126004[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps443126004[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Mail.type): SharedBuilder_IconPropsSVGProps443126004[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps443126004[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
}

