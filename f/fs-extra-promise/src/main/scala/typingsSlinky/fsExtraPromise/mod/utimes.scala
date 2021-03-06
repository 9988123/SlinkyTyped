package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: String, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(
    path: String,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(path: Buffer, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, atime: Double, mtime: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(
    path: Buffer,
    atime: js.Date,
    mtime: js.Date,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

