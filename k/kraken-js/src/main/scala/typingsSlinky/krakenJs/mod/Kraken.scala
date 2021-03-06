package typingsSlinky.krakenJs.mod

import typingsSlinky.expressServeStaticCore.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kraken extends Express {
  @JSName("kraken")
  var kraken_Original: Kraken = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def kraken(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def kraken(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def kraken(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

