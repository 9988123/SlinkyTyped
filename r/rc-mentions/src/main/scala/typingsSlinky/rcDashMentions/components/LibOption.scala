package typingsSlinky.rcDashMentions.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashMentions.libOptionMod.OptionProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LibOption
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typingsSlinky.rcDashMentions.libMod.default.Option.asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(style: CSSProperties = null, value: String = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OptionProps
}

