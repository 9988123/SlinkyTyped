package typingsSlinky.nodeBrowserHistory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-browser-history", "getOperaHistory")
@js.native
object getOperaHistory extends js.Object {
  def apply(): js.Promise[js.Array[BrowserHistory]] = js.native
  def apply(historyTimeLength: Double): js.Promise[js.Array[BrowserHistory]] = js.native
}

