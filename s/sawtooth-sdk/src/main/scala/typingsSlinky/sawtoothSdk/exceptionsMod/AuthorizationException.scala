package typingsSlinky.sawtoothSdk.exceptionsMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/processor/exceptions", "AuthorizationException")
@js.native
/**
  * Construcs a new AuthorizationException
  *
  * @param [message] - an optional message, defaults to the empty
  * string
  */
class AuthorizationException () extends Error {
  def this(message: String) = this()
}

