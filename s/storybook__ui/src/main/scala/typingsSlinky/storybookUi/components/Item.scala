package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Pick
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.react.mod.PropsWithChildren[
js.Any with (typingsSlinky.emotionStyledBase.helperMod.Omit[
  typingsSlinky.std.Pick[js.Any, java.lang.String | scala.Double | js.Symbol], 
  typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
]) with typingsSlinky.emotionStyledBase.anon.`0`[typingsSlinky.storybookTheming.typesMod.Theme]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object Item {
  @JSImport("@storybook/ui/dist/components/sidebar/SidebarItem", "Item")
  @js.native
  object component extends js.Object
  
  def apply(
    p: PropsWithChildren[
      js.Any with (Omit[Pick[js.Any, String | Double | js.Symbol], theme]) with `0`[Theme]
    ]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Item.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

