package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowExternalProcessStartedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var processUuid: String = js.native
}

object WindowExternalProcessStartedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, processUuid: String, topic: Topic, `type`: Type, uuid: String): WindowExternalProcessStartedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processUuid = processUuid.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowExternalProcessStartedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowExternalProcessStartedEventOps[Self <: WindowExternalProcessStartedEvent[_, _], Topic, Type] (val x: Self with (WindowExternalProcessStartedEvent[Topic, Type])) extends AnyVal {
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
    def setProcessUuid(value: String): Self = this.set("processUuid", value.asInstanceOf[js.Any])
  }
  
}

