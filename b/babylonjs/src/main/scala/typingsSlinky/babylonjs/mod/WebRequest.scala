package typingsSlinky.babylonjs.mod

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebRequest")
@js.native
class WebRequest ()
  extends typingsSlinky.babylonjs.legacyMod.WebRequest

/* static members */
@JSImport("babylonjs", "WebRequest")
@js.native
object WebRequest extends js.Object {
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  var CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  /**
    * Add callback functions in this array to update all the requests before they get sent to the network
    */
  var CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
}

