package typingsSlinky.reactOverlays.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionCallbacks extends js.Object {
  /**
    * Callback fired before the Overlay transitions in
    */
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired after the Overlay finishes transitioning in
    */
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired as the Overlay begins to transition in
    */
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired right before the Overlay transitions out
    */
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired after the Overlay finishes transitioning out
    */
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  /**
    * Callback fired as the Overlay begins to transition out
    */
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
}

object TransitionCallbacks {
  @scala.inline
  def apply(): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionCallbacks]
  }
  @scala.inline
  implicit class TransitionCallbacksOps[Self <: TransitionCallbacks] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: /* node */ HTMLElement => _): Self = this.set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: /* node */ HTMLElement => _): Self = this.set("onEntered", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: /* node */ HTMLElement => _): Self = this.set("onEntering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: /* node */ HTMLElement => _): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: /* node */ HTMLElement => _): Self = this.set("onExited", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: /* node */ HTMLElement => _): Self = this.set("onExiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
  }
  
}

