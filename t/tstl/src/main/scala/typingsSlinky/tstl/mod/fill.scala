package typingsSlinky.tstl.mod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "fill")
@js.native
object fill extends js.Object {
  def apply[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
}

