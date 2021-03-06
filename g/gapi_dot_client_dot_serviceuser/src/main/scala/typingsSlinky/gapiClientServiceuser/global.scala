package typingsSlinky.gapiClientServiceuser

import typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser.ProjectsResource
import typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser.ServicesResource
import typingsSlinky.gapiClientServiceuser.gapiClientServiceuserStrings.serviceuser
import typingsSlinky.gapiClientServiceuser.gapiClientServiceuserStrings.v1
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
      val projects: ProjectsResource = js.native
      val services: ServicesResource = js.native
      /** Load Google Service User API v1 */
      def load(name: serviceuser, version: v1): js.Thenable[Unit] = js.native
      def load(name: serviceuser, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

