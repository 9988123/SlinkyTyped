package typingsSlinky.googleGax.mod

import typingsSlinky.googleGax.gaxMod.BackoffSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "createMaxRetriesBackoffSettings")
@js.native
object createMaxRetriesBackoffSettings extends js.Object {
  def apply(
    initialRetryDelayMillis: Double,
    retryDelayMultiplier: Double,
    maxRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    rpcTimeoutMultiplier: Double,
    maxRpcTimeoutMillis: Double,
    maxRetries: Double
  ): BackoffSettings = js.native
}

