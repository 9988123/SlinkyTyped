package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "utimesSync")
@js.native
object utimesSync extends js.Object {
  def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: js.Date): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: js.Date): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: js.Date, mtime: js.Date): Unit = js.native
}

