package typingsSlinky.intercomClient.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "ApiResponse")
@js.native
class ApiResponse[T] () extends IncomingMessage {
  var body: T = js.native
}

