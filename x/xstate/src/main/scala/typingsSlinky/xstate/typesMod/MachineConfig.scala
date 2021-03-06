package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[String] = js.native
}

object MachineConfig {
  @scala.inline
  def apply[TContext, /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typingsSlinky.xstate.typesMod.EventObject */ TEvent](): MachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class MachineConfigOps[Self <: MachineConfig[_, _, _], TContext, /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typingsSlinky.xstate.typesMod.EventObject */ TEvent] (val x: Self with (MachineConfig[TContext, TStateSchema, TEvent])) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

