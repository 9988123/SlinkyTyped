package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.OmitSliderset
import typingsSlinky.tabris.tabrisStrings.maximum
import typingsSlinky.tabris.tabrisStrings.minimum
import typingsSlinky.tabris.tabrisStrings.selection
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.tintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Slider")
@js.native
class Slider () extends Widget {
  def this(properties: Properties[Slider, OmitSliderset]) = this()
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Slider: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * The maximum value.
    */
  var maximum: Double = js.native
  /**
    * The minimum value.
    */
  var minimum: Double = js.native
  /**
    * Fired when the [*maximum*](#maximum) property has changed.
    */
  var onMaximumChanged: ChangeListeners[this.type, maximum] = js.native
  /**
    * Fired when the [*minimum*](#minimum) property has changed.
    */
  var onMinimumChanged: ChangeListeners[this.type, minimum] = js.native
  /**
    * Fired when the selection property is changed by the user.
    */
  var onSelect: Listeners[SliderSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*selection*](#selection) property has changed.
    */
  var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
  /**
    * Fired when the [*tintColor*](#tintColor) property has changed.
    */
  var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
  /**
    * The actual value.
    */
  var selection: Double = js.native
  /**
    * The color used to display the current selection.
    */
  var tintColor: ColorValue = js.native
}

