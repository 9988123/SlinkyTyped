package typingsSlinky.semver.preloadMod

import typingsSlinky.semver.mod.Options
import typingsSlinky.semver.semverMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/preload", "minSatisfying")
@js.native
object minSatisfying extends js.Object {
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  def apply[T /* <: String | ^  */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
}

