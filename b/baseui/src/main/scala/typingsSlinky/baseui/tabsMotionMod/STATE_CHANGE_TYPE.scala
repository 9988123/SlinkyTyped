package typingsSlinky.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATE_CHANGE_TYPE extends js.Object

@JSImport("baseui/tabs-motion", "STATE_CHANGE_TYPE")
@js.native
object STATE_CHANGE_TYPE extends js.Object {
  @js.native
  sealed trait change extends STATE_CHANGE_TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[STATE_CHANGE_TYPE with String] = js.native
  /* "change" */ @js.native
  object change extends TopLevel[change with String]
  
}

