package typingsSlinky.gapiClientClouddebugger

import typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger.ControllerResource
import typingsSlinky.gapiClientClouddebugger.gapiClientClouddebuggerStrings.clouddebugger
import typingsSlinky.gapiClientClouddebugger.gapiClientClouddebuggerStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val controller: ControllerResource = js.native
      /** Load Stackdriver Debugger API v2 */
      def load(name: clouddebugger, version: v2): js.Thenable[Unit] = js.native
      def load(name: clouddebugger, version: v2, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

