package typingsSlinky.gracefulFs.mod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.fsMod.ReadSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readSync")
@js.native
object readSync extends js.Object {
  def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
  def apply(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = js.native
}

