package typingsSlinky.fsExtraPromise.mod

import typingsSlinky.fsExtra.mod.ReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "readJson")
@js.native
object readJson extends js.Object {
  def apply(file: String): js.Promise[_] = js.native
  def apply(file: String, callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]): Unit = js.native
  def apply(file: String, options: ReadOptions): js.Promise[_] = js.native
  def apply(
    file: String,
    options: ReadOptions,
    callback: js.Function2[/* err */ js.Error, /* jsonObject */ js.Any, Unit]
  ): Unit = js.native
}

