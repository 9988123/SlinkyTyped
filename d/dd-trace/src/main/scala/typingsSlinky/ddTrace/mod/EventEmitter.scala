package typingsSlinky.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait EventEmitter extends js.Object {
  var addListener: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var off: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var on: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  var removeListener: js.UndefOr[
    js.Function2[
      /* eventName */ String | js.Symbol, 
      /* listener */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ] = js.native
  def emit(eventName: String, args: js.Any*): js.Any = js.native
  def emit(eventName: js.Symbol, args: js.Any*): js.Any = js.native
}

