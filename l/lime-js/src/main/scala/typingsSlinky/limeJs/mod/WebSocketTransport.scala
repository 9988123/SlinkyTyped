package typingsSlinky.limeJs.mod

import org.scalajs.dom.raw.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "WebSocketTransport")
@js.native
class WebSocketTransport () extends Transport {
  def this(traceEnabled: Boolean) = this()
  var webSocket: WebSocket = js.native
}

