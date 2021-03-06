package typingsSlinky.guacamoleClient.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "StaticHTTPTunnel")
@js.native
class StaticHTTPTunnel protected ()
  extends typingsSlinky.guacamoleClient.staticHTTPTunnelMod.StaticHTTPTunnel {
  /**
    * @param url The URL of a Guacamole protocol dump.
    * @param [crossDomain=false] Whether tunnel requests will be cross-domain, and thus must use CORS
    * mechanisms and headers. By default, it is assumed that tunnel requests will be made to the same domain.
    * @param [extraTunnelHeaders={}] Key value pairs containing the header names and values of any additional
    * headers to be sent in tunnel requests. By default, no extra headers will be added.
    */
  def this(url: String) = this()
  def this(url: String, crossDomain: Boolean) = this()
  def this(url: String, crossDomain: js.UndefOr[scala.Nothing], extraTunnelHeaders: Record[String, String]) = this()
  def this(url: String, crossDomain: Boolean, extraTunnelHeaders: Record[String, String]) = this()
}

