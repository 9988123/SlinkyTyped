package typingsSlinky.easyXapiSupertest.fsMod

import typingsSlinky.easyXapiSupertest.anon.Flag
import typingsSlinky.easyXapiSupertest.anon.`1`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(filename: String): Buffer = js.native
  def apply(filename: String, encoding: String): String = js.native
  def apply(filename: String, options: Flag): String = js.native
  def apply(filename: String, options: `1`): Buffer = js.native
}

