package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StorybookIcon {
  @JSImport("@storybook/components", "StorybookIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StorybookIcon.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

