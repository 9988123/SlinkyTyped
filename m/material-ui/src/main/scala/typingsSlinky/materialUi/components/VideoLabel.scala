package typingsSlinky.materialUi.components

import typingsSlinky.materialUi.MaterialUI.SvgIconProps
import typingsSlinky.materialUi.videoLabelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VideoLabel {
  @JSImport("material-ui/svg-icons/av/video-label", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VideoLabel.type): SharedBuilder_SvgIconProps_1073724525[default] = new SharedBuilder_SvgIconProps_1073724525[default](js.Array(this.component, js.Dictionary.empty))()
}

