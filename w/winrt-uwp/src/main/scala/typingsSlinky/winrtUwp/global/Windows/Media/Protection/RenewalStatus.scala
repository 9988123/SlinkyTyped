package typingsSlinky.winrtUwp.global.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends js.Object {
  /* 3 */ val appComponentsMayNeedUpdating: typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating with Double = js.native
  /* 4 */ val noComponentsFound: typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus.noComponentsFound with Double = js.native
  /* 0 */ val notStarted: typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus.notStarted with Double = js.native
  /* 1 */ val updatesInProgress: typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus.updatesInProgress with Double = js.native
  /* 2 */ val userCancelled: typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus.userCancelled with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Media.Protection.RenewalStatus with Double] = js.native
}

