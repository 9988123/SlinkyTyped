package typingsSlinky.gracefulFs.mod

import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.WriteVResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "writev")
@js.native
object writev extends js.Object {
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[WriteVResult] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WriteVResult] = js.native
}

