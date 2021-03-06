package typingsSlinky.gapiClientFirebasedynamiclinks

import typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.ShortLinksResource
import typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks.V1Resource
import typingsSlinky.gapiClientFirebasedynamiclinks.gapiClientFirebasedynamiclinksStrings.firebasedynamiclinks
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
      val shortLinks: ShortLinksResource = js.native
      val v1: V1Resource = js.native
      /** Load Firebase Dynamic Links API v1 */
      def load(
        name: firebasedynamiclinks,
        version: typingsSlinky.gapiClientFirebasedynamiclinks.gapiClientFirebasedynamiclinksStrings.v1
      ): js.Thenable[Unit] = js.native
      def load(
        name: firebasedynamiclinks,
        version: typingsSlinky.gapiClientFirebasedynamiclinks.gapiClientFirebasedynamiclinksStrings.v1,
        callback: js.Function0[_]
      ): Unit = js.native
    }
    
  }
  
}

