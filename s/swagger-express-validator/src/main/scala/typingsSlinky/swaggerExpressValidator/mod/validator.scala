package typingsSlinky.swaggerExpressValidator.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-express-validator", "validator")
@js.native
object validator extends js.Object {
  def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

