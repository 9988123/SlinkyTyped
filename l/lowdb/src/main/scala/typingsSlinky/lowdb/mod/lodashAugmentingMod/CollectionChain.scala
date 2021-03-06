package typingsSlinky.lowdb.mod.lodashAugmentingMod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionChain[T] extends js.Object {
  def write(): ArrayLike[T] with js.Promise[ArrayLike[T]] = js.native
}

object CollectionChain {
  @scala.inline
  def apply[T](write: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): CollectionChain[T] = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
    __obj.asInstanceOf[CollectionChain[T]]
  }
  @scala.inline
  implicit class CollectionChainOps[Self <: CollectionChain[_], T] (val x: Self with CollectionChain[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWrite(value: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): Self = this.set("write", js.Any.fromFunction0(value))
  }
  
}

