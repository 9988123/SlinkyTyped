package typingsSlinky.rx.rxExperimentalMod

import typingsSlinky.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.experimental", "CompositeDisposable")
@js.native
class CompositeDisposableCls protected ()
  extends typingsSlinky.rx.Rx.CompositeDisposable {
  /**
    * Represents a group of disposable resources that are disposed together.
    * @constructor
    */
  def this(disposables: IDisposable*) = this()
  /**
    * Represents a group of disposable resources that are disposed together.
    * @constructor
    */
  def this(disposables: js.Array[IDisposable]) = this()
}

