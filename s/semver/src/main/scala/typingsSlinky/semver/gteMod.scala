package typingsSlinky.semver

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/gte", JSImport.Namespace)
@js.native
object gteMod extends js.Object {
  /**
    * v1 >= v2
    */
  def apply(v1: String, v2: String): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: String, v2: ^): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: String): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  def apply(v1: ^, v2: ^): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  def apply(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
}

