package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactInstantsearchDom.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitsProps[T] extends js.Object {
  var hitComponent: js.UndefOr[ReactComponentClass[Hit[T]]] = js.native
}

object HitsProps {
  @scala.inline
  def apply[T](): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitsProps[T]]
  }
  @scala.inline
  implicit class HitsPropsOps[Self[t] <: HitsProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHitComponentFunctionComponent(value: ReactComponentClass[Hit[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitComponentComponentClass(value: ReactComponentClass[Hit[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitComponent(value: ReactComponentClass[Hit[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitComponent")(js.undefined)
        ret
    }
  }
  
}

