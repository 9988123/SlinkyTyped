package typingsSlinky.reactRouter.mod

import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryRouterProps extends js.Object {
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.native
  var initialEntries: js.UndefOr[js.Array[LocationDescriptor[LocationState]]] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var keyLength: js.UndefOr[Double] = js.native
}

object MemoryRouterProps {
  @scala.inline
  def apply(): MemoryRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryRouterProps]
  }
  @scala.inline
  implicit class MemoryRouterPropsOps[Self <: MemoryRouterProps] (val x: Self) extends AnyVal {
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
    def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = this.set("getUserConfirmation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetUserConfirmation: Self = this.set("getUserConfirmation", js.undefined)
    @scala.inline
    def setInitialEntriesVarargs(value: LocationDescriptor[LocationState]*): Self = this.set("initialEntries", js.Array(value :_*))
    @scala.inline
    def setInitialEntries(value: js.Array[LocationDescriptor[LocationState]]): Self = this.set("initialEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialEntries: Self = this.set("initialEntries", js.undefined)
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    @scala.inline
    def setKeyLength(value: Double): Self = this.set("keyLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyLength: Self = this.set("keyLength", js.undefined)
  }
  
}

