package typingsSlinky.tslint.utilsMod

import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isTypeFlagSet")
@js.native
object isTypeFlagSet extends js.Object {
  def apply(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
}

