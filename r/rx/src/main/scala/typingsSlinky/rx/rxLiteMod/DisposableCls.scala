package typingsSlinky.rx.rxLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.lite", "Disposable")
@js.native
class DisposableCls protected ()
  extends typingsSlinky.rx.Rx.Disposable {
  /**
    * Provides a set of static methods for creating Disposables.
    * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
    */
  def this(action: js.Function0[Unit]) = this()
}

