package typingsSlinky.behavior3.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RepeatUntilFailure is a decorator that repeats the tick signal until the
  * node child returns `FAILURE`, `RUNNING` or `ERROR`. Optionally, a maximum
  * number of repetitions can be defined.
  *
  */
@js.native
trait RepeatUntilFailure extends BaseNode

object RepeatUntilFailure {
  @scala.inline
  def apply(
    _close: Tick => Unit,
    _enter: Tick => Unit,
    _execute: Tick => Double,
    _exit: Tick => Unit,
    _open: Tick => Unit,
    _tick: Tick => Double,
    close: Tick => Unit,
    enter: Tick => Unit,
    exit: Tick => Unit,
    open: Tick => Unit,
    tick: Tick => Unit
  ): RepeatUntilFailure = {
    val __obj = js.Dynamic.literal(_close = js.Any.fromFunction1(_close), _enter = js.Any.fromFunction1(_enter), _execute = js.Any.fromFunction1(_execute), _exit = js.Any.fromFunction1(_exit), _open = js.Any.fromFunction1(_open), _tick = js.Any.fromFunction1(_tick), close = js.Any.fromFunction1(close), enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit), open = js.Any.fromFunction1(open), tick = js.Any.fromFunction1(tick))
    __obj.asInstanceOf[RepeatUntilFailure]
  }
}

