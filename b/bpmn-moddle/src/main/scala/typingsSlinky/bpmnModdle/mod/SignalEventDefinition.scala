package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalEventDefinition extends BaseElement {
  var signalRef: Signal = js.native
}

object SignalEventDefinition {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, signalRef: Signal): SignalEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], signalRef = signalRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalEventDefinition]
  }
  @scala.inline
  implicit class SignalEventDefinitionOps[Self <: SignalEventDefinition] (val x: Self) extends AnyVal {
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
    def setSignalRef(value: Signal): Self = this.set("signalRef", value.asInstanceOf[js.Any])
  }
  
}

