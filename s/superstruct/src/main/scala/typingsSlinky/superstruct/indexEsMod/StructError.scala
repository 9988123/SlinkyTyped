package typingsSlinky.superstruct.indexEsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `StructError` objects are thrown (or returned) by Superstruct when its
  * validation fails. The error represents the first error encountered during
  * validation. But they also have an `error.failures` property that holds
  * information for all of the failures encountered.
  */
/**
  * `StructError` objects are thrown (or returned) by Superstruct when its
  * validation fails. The error represents the first error encountered during
  * validation. But they also have an `error.failures` property that holds
  * information for all of the failures encountered.
  */
@JSImport("superstruct/lib/index.es", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failure: StructFailure, iterable: js.Iterable[StructFailure]) = this()
  var branch: js.Array[_] = js.native
  var path: js.Array[Double | String] = js.native
  var `type`: String = js.native
  var value: js.Any = js.native
  def failures(): js.Iterable[StructFailure] = js.native
}

