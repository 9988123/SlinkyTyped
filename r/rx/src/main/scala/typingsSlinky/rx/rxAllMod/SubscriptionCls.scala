package typingsSlinky.rx.rxAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.all", "Subscription")
@js.native
class SubscriptionCls protected ()
  extends typingsSlinky.rx.Rx.Subscription {
  /**
    * Creates a new subscription object with the given virtual subscription and unsubscription time.
    *
    * @constructor
    * @param {Number} subscribe Virtual time at which the subscription occurred.
    * @param {Number} unsubscribe Virtual time at which the unsubscription occurred.
    */
  def this(subscribeAt: Double) = this()
  def this(subscribeAt: Double, unsubscribeAt: Double) = this()
}

