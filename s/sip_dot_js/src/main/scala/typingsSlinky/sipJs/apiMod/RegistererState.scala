package typingsSlinky.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "RegistererState")
@js.native
object RegistererState extends js.Object {
  /* "Initial" */ val Initial: typingsSlinky.sipJs.registererStateMod.RegistererState.Initial with String = js.native
  /* "Registered" */ val Registered: typingsSlinky.sipJs.registererStateMod.RegistererState.Registered with String = js.native
  /* "Terminated" */ val Terminated: typingsSlinky.sipJs.registererStateMod.RegistererState.Terminated with String = js.native
  /* "Unregistered" */ val Unregistered: typingsSlinky.sipJs.registererStateMod.RegistererState.Unregistered with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.sipJs.registererStateMod.RegistererState with String] = js.native
}

