package typingsSlinky.blueprintjsCore.refsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRefObject[T] extends js.Object {
  val current: T | Null = js.native
}

object IRefObject {
  @scala.inline
  def apply[T](): IRefObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRefObject[T]]
  }
  @scala.inline
  implicit class IRefObjectOps[Self <: IRefObject[_], T] (val x: Self with IRefObject[T]) extends AnyVal {
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
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNull: Self = this.set("current", null)
  }
  
}

