package typingsSlinky.puppeteer.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CDPSession extends EventEmitter {
  /**
    * Detaches session from target. Once detached, session won't emit any events and can't be used
    * to send messages.
    */
  def detach(): js.Promise[Unit] = js.native
  /**
    * @param method Protocol method name
    */
  def send(method: String): js.Promise[js.Object] = js.native
  def send(method: String, params: js.Object): js.Promise[js.Object] = js.native
}

