package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "open")
@js.native
object open extends js.Object {
  def apply(path: String): Dataset = js.native
  def apply(path: String, mode: js.UndefOr[scala.Nothing], drivers: String): Dataset = js.native
  def apply(path: String, mode: js.UndefOr[scala.Nothing], drivers: js.Array[String]): Dataset = js.native
}

