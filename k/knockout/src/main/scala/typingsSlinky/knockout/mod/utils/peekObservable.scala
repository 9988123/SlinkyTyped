package typingsSlinky.knockout.mod.utils

import typingsSlinky.knockout.mod.MaybeSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.peekObservable")
@js.native
object peekObservable extends js.Object {
  def apply[T](value: MaybeSubscribable[T]): T = js.native
}

