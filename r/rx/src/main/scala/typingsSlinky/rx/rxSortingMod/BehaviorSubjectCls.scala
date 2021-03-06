package typingsSlinky.rx.rxSortingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.sorting", "BehaviorSubject")
@js.native
class BehaviorSubjectCls[T] protected ()
  extends typingsSlinky.rx.Rx.BehaviorSubject[T] {
  /**
    *  Initializes a new instance of the BehaviorSubject class which creates a subject that caches its last value and starts with the specified value.
    *  @param {Mixed} value Initial value sent to observers when no other value has been received by the subject yet.
    */
  def this(initialValue: T) = this()
}

