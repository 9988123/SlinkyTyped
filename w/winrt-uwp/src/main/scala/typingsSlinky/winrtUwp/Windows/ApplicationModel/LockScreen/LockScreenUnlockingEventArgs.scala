package typingsSlinky.winrtUwp.Windows.ApplicationModel.LockScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the lock screen unlocking events. */
@js.native
trait LockScreenUnlockingEventArgs extends js.Object {
  /** Gets the deadline by which the lock screen app must unlock the device. If your unlocking deferral takes too long, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  var deadline: js.Date = js.native
  /**
    * Gets a LockScreenUnlockingDeferral , which defers the unlocking of the device.
    * @return An unlock deferral.
    */
  def getDeferral(): LockScreenUnlockingDeferral = js.native
}

object LockScreenUnlockingEventArgs {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => LockScreenUnlockingDeferral): LockScreenUnlockingEventArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[LockScreenUnlockingEventArgs]
  }
  @scala.inline
  implicit class LockScreenUnlockingEventArgsOps[Self <: LockScreenUnlockingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => LockScreenUnlockingDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

