package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import typingsSlinky.jestDiff.typesMod.DiffOptionsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/getAlignedDiffs", JSImport.Namespace)
@js.native
object getAlignedDiffsMod extends js.Object {
  def default(diffs: js.Array[Diff], changeColor: DiffOptionsColor): js.Array[Diff] = js.native
}

