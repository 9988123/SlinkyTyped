package typingsSlinky.hexoFs.mod

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "symlinkSync")
@js.native
object symlinkSync extends js.Object {
  def apply(target: PathLike, path: PathLike): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
}

