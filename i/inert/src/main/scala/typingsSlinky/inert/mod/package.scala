package typingsSlinky.inert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RequestHandler[T] = js.Function1[/* request */ typingsSlinky.hapi.mod.Request, T]
}
