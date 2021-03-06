package typingsSlinky.saywhen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHandler[T /* <: Func */] extends js.Object {
  val isCalled: Proxy[T] = js.native
  def isCalledWith(args: js.Any*): Proxy[T] = js.native
}

object CallHandler {
  @scala.inline
  def apply[/* <: typingsSlinky.saywhen.mod.Func */ T](isCalled: Proxy[T], isCalledWith: /* repeated */ js.Any => Proxy[T]): CallHandler[T] = {
    val __obj = js.Dynamic.literal(isCalled = isCalled.asInstanceOf[js.Any], isCalledWith = js.Any.fromFunction1(isCalledWith))
    __obj.asInstanceOf[CallHandler[T]]
  }
  @scala.inline
  implicit class CallHandlerOps[Self <: CallHandler[_], /* <: typingsSlinky.saywhen.mod.Func */ T] (val x: Self with CallHandler[T]) extends AnyVal {
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
    def setIsCalled(value: Proxy[T]): Self = this.set("isCalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCalledWith(value: /* repeated */ js.Any => Proxy[T]): Self = this.set("isCalledWith", js.Any.fromFunction1(value))
  }
  
}

