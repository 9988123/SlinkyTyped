package typingsSlinky.scErrors.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "SocketProtocolError")
@js.native
class SocketProtocolError protected () extends Error {
  def this(message: String, code: Double) = this()
  var code: Double = js.native
}

