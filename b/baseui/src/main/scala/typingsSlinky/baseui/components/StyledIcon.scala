package typingsSlinky.baseui.components

import typingsSlinky.baseui.progressStepsMod.StyleProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyledIcon {
  @JSImport("baseui/progress-steps", "StyledIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[StyleProps with StyletronComponentInjectedProps[StyleProps]]): SharedBuilder_PropsWithChildren_6741298 = new SharedBuilder_PropsWithChildren_6741298(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StyledIcon.type): SharedBuilder_PropsWithChildren_6741298 = new SharedBuilder_PropsWithChildren_6741298(js.Array(this.component, js.Dictionary.empty))()
}

