package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.OpenMode
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "openSync")
@js.native
object openSync extends js.Object {
  def apply(path: PathLike, flags: OpenMode): Double = js.native
  def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
}

