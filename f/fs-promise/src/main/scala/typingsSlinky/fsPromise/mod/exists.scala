package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "exists")
@js.native
object exists extends js.Object {
  def apply(path: PathLike): js.Promise[Boolean] = js.native
  def apply(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
  /**
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @JSName("__promisify__")
  def promisify(path: PathLike): js.Promise[Boolean] = js.native
}

