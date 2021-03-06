package typingsSlinky.easyXHeaders.fsMod

import typingsSlinky.easyXHeaders.NodeJS.ErrnoException
import typingsSlinky.easyXHeaders.anon.EncodingFlag
import typingsSlinky.easyXHeaders.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "appendFile")
@js.native
object appendFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: EncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(filename: String, data: js.Any, options: Mode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: Mode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

