package typingsSlinky.uifabricStyling.ieffectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEffects extends js.Object {
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * The shadow's color should not change with the theme, because colored shadows look unnatural.
    * Used for: search result dropdowns, hover cards, tooltips, help bubbles
    */
  var elevation16: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * The shadow's color should not change with the theme, because colored shadows look unnatural.
    * Used for: cards, grid items
    */
  var elevation4: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * The shadow's color should not change with the theme, because colored shadows look unnatural.
    * Used for: Panels, Dialogs
    */
  var elevation64: String = js.native
  /**
    * Used to provide a visual affordance that this element is elevated above the surface it rests on.
    * This is lower than elevations with a higher value, and higher than elevations with a lower value.
    * The shadow's color should not change with the theme, because colored shadows look unnatural.
    * Used for: menus, command surfaces
    */
  var elevation8: String = js.native
  /**
    * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
    * Smaller elements should get less rounding than larger elements.
    * Used for: buttons
    */
  var roundedCorner2: String = js.native
  /**
    * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
    * Smaller elements should get less rounding than larger elements.
    * Used for: cards
    */
  var roundedCorner4: String = js.native
  /**
    * Rounded corner value, for use with border-radius. Smaller values indicate less rounding.
    * Smaller elements should get less rounding than larger elements.
    * Used for: surfaces
    */
  var roundedCorner6: String = js.native
}

object IEffects {
  @scala.inline
  def apply(
    elevation16: String,
    elevation4: String,
    elevation64: String,
    elevation8: String,
    roundedCorner2: String,
    roundedCorner4: String,
    roundedCorner6: String
  ): IEffects = {
    val __obj = js.Dynamic.literal(elevation16 = elevation16.asInstanceOf[js.Any], elevation4 = elevation4.asInstanceOf[js.Any], elevation64 = elevation64.asInstanceOf[js.Any], elevation8 = elevation8.asInstanceOf[js.Any], roundedCorner2 = roundedCorner2.asInstanceOf[js.Any], roundedCorner4 = roundedCorner4.asInstanceOf[js.Any], roundedCorner6 = roundedCorner6.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffects]
  }
  @scala.inline
  implicit class IEffectsOps[Self <: IEffects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElevation16(value: String): Self = this.set("elevation16", value.asInstanceOf[js.Any])
    @scala.inline
    def setElevation4(value: String): Self = this.set("elevation4", value.asInstanceOf[js.Any])
    @scala.inline
    def setElevation64(value: String): Self = this.set("elevation64", value.asInstanceOf[js.Any])
    @scala.inline
    def setElevation8(value: String): Self = this.set("elevation8", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCorner2(value: String): Self = this.set("roundedCorner2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCorner4(value: String): Self = this.set("roundedCorner4", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCorner6(value: String): Self = this.set("roundedCorner6", value.asInstanceOf[js.Any])
  }
  
}

