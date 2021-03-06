package typingsSlinky.reactAsync.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAsync.anon.Initial
import typingsSlinky.reactAsync.mod.AbstractState
import typingsSlinky.reactAsync.mod.AsyncFulfilled
import typingsSlinky.reactAsync.mod.AsyncInitial
import typingsSlinky.reactAsync.mod.AsyncPending
import typingsSlinky.reactAsync.mod.AsyncRejected
import typingsSlinky.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfPending {
  @JSImport("react-async", "IfPending")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: js.Object */ T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenFunction1(value: /* state */ AsyncPending[T, AbstractState[T]] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    @scala.inline
    def children(value: PendingChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def initial(value: Boolean): this.type = set("initial", value.asInstanceOf[js.Any])
  }
  
  def withProps[/* <: js.Object */ T](p: Initial[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[/* <: js.Object */ T](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Builder[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Initial[T]]))
  }
}

