package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.OmitProgressBarset
import typingsSlinky.tabris.tabrisStrings.error
import typingsSlinky.tabris.tabrisStrings.maximum
import typingsSlinky.tabris.tabrisStrings.minimum
import typingsSlinky.tabris.tabrisStrings.normal
import typingsSlinky.tabris.tabrisStrings.paused
import typingsSlinky.tabris.tabrisStrings.selection
import typingsSlinky.tabris.tabrisStrings.set
import typingsSlinky.tabris.tabrisStrings.state
import typingsSlinky.tabris.tabrisStrings.tintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ProgressBar")
@js.native
class ProgressBar () extends Widget {
  def this(properties: Properties[ProgressBar, OmitProgressBarset]) = this()
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_ProgressBar: (JSXAttributes[this.type, Omit[this.type, set | typingsSlinky.tabris.tabrisStrings.jsxAttributes]]) with js.Object = js.native
  /**
    * The value that represents a progress of 100%. May be negative.
    */
  var maximum: Double = js.native
  /**
    * The value that represents a progress of 0%. May be negative.
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
    * Fired when the [*selection*](#selection) property has changed.
    */
  var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
  /**
    * Fired when the [*state*](#state) property has changed.
    */
  var onStateChanged: ChangeListeners[this.type, state] = js.native
  /**
    * Fired when the [*tintColor*](#tintColor) property has changed.
    */
  var onTintColorChanged: ChangeListeners[this.type, tintColor] = js.native
  /**
    * The actual progress to be displayed.
    */
  var selection: Double = js.native
  /**
    * This property affects the color of the progress indicator. Not supported on iOS.
    */
  var state: error | normal | paused = js.native
  /**
    * The color used to display the current progress.
    */
  var tintColor: ColorValue = js.native
}

