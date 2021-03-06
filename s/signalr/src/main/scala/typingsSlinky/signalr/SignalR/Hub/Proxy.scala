package typingsSlinky.signalr.SignalR.Hub

import typingsSlinky.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var connection: Connection = js.native
  var hubName: String = js.native
  var state: js.Any = js.native
  def hasSubscriptions(): Boolean = js.native
  def init(connection: Connection, hubName: String): Unit = js.native
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: String, args: js.Any*): JQueryPromise[_] = js.native
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback [Optional] The callback to unregister. If not provided, all callbacks previously registered under that event name will be unregistered.
    */
  def off(eventName: String): Proxy = js.native
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
}

