package typingsSlinky.broFs.mod

import typingsSlinky.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "mkdir")
@js.native
object mkdir extends js.Object {
  def apply(path: String): js.Promise[DirectoryEntry] = js.native
}

