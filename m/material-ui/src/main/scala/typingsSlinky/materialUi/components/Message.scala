package typingsSlinky.materialUi.components

import typingsSlinky.materialUi.MaterialUI.SvgIconProps
import typingsSlinky.materialUi.messageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Message {
  @JSImport("material-ui/svg-icons/communication/message", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Message.type): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, js.Dictionary.empty))()
}

