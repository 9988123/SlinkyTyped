package typingsSlinky.googleCloudPubsub.mod

import typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISubscription
import typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionMetadata
import typingsSlinky.googleCloudPubsub.subscriptionMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
class Subscription protected ()
  extends typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription {
  def this(pubsub: typingsSlinky.googleCloudPubsub.srcPubsubMod.PubSub, name: String) = this()
  def this(
    pubsub: typingsSlinky.googleCloudPubsub.srcPubsubMod.PubSub,
    name: String,
    options: SubscriptionOptions
  ) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Subscription")
@js.native
object Subscription extends js.Object {
  /*!
    * Formats Subscription metadata.
    *
    * @private
    */
  def formatMetadata_(metadata: SubscriptionMetadata): ISubscription = js.native
  /*!
    * Format the name of a subscription. A subscription's full name is in the
    * format of projects/{projectId}/subscriptions/{subName}.
    *
    * @private
    */
  def formatName_(projectId: String, name: String): String = js.native
}

