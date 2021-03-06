package typingsSlinky.gapiClientSourcerepo

import typingsSlinky.gapiClientSourcerepo.gapi.client.sourcerepo.ProjectsResource
import typingsSlinky.gapiClientSourcerepo.gapiClientSourcerepoStrings.sourcerepo
import typingsSlinky.gapiClientSourcerepo.gapiClientSourcerepoStrings.v1
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
      /** Load Cloud Source Repositories API v1 */
      def load(name: sourcerepo, version: v1): js.Thenable[Unit] = js.native
      def load(name: sourcerepo, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

