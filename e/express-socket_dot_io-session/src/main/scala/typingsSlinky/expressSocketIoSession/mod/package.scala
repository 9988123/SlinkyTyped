package typingsSlinky.expressSocketIoSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ typingsSlinky.socketIo.mod.Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}
