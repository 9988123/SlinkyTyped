package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesRatingMod.default
import typingsSlinky.semanticDashUiDashReact.distCommonjsModulesRatingRatingMod.RatingProps
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.auto
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.heart
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.star
import typingsSlinky.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.semanticDashUiDashReact.distCommonjsModulesRatingMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    as: js.Any = null,
    clearable: Boolean | auto = null,
    defaultRating: Double | String = null,
    icon: star | heart = null,
    maxRating: Double | String = null,
    onRate: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ RatingProps) => Unit = null,
    rating: Double | String = null,
    size: mini | tiny | small | large | huge | massive = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (clearable != null) __obj.updateDynamic("clearable")(clearable.asInstanceOf[js.Any])
    if (defaultRating != null) __obj.updateDynamic("defaultRating")(defaultRating.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxRating != null) __obj.updateDynamic("maxRating")(maxRating.asInstanceOf[js.Any])
    if (onRate != null) __obj.updateDynamic("onRate")(js.Any.fromFunction2(onRate))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RatingProps
}

