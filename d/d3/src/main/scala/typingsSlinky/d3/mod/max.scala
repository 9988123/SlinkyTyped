package typingsSlinky.d3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "max")
@js.native
object max extends js.Object {
  def apply(array: js.Iterable[String]): js.UndefOr[String] = js.native
  def apply[T](
    array: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.UndefOr[String] = js.native
}

