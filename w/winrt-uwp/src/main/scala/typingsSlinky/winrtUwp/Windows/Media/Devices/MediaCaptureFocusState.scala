package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaCaptureFocusState extends js.Object

/** Defines the different focus states the capture device can be in. */
@JSGlobal("Windows.Media.Devices.MediaCaptureFocusState")
@js.native
object MediaCaptureFocusState extends js.Object {
  /** The attempt to focus has failed. */
  @js.native
  sealed trait failed extends MediaCaptureFocusState
  
  /** Focused. */
  @js.native
  sealed trait focused extends MediaCaptureFocusState
  
  /** The focus has been lost. */
  @js.native
  sealed trait lost extends MediaCaptureFocusState
  
  /** Searching for focus. */
  @js.native
  sealed trait searching extends MediaCaptureFocusState
  
  /** The focus state is uninitialized. */
  @js.native
  sealed trait uninitialized extends MediaCaptureFocusState
  
}

