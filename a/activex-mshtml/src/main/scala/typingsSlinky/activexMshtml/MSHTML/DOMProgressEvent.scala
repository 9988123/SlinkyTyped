package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMProgressEvent extends js.Object {
  @JSName("MSHTML.DOMProgressEvent_typekey")
  var MSHTMLDotDOMProgressEvent_typekey: DOMProgressEvent = js.native
  val bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  val cancelable: Boolean = js.native
  val currentTarget: IEventTarget = js.native
  val defaultPrevented: Boolean = js.native
  val eventPhase: Double = js.native
  val isTrusted: Boolean = js.native
  val lengthComputable: Boolean = js.native
  val loaded: Double = js.native
  val srcElement: IHTMLElement = js.native
  val target: IEventTarget = js.native
  val timeStamp: Double = js.native
  val total: Double = js.native
  val `type`: String = js.native
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  def initProgressEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object DOMProgressEvent {
  @scala.inline
  def apply(
    MSHTMLDotDOMProgressEvent_typekey: DOMProgressEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initProgressEvent: (String, Boolean, Boolean, Boolean, Double, Double) => Unit,
    isTrusted: Boolean,
    lengthComputable: Boolean,
    loaded: Double,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    total: Double,
    `type`: String
  ): DOMProgressEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initProgressEvent = js.Any.fromFunction6(initProgressEvent), isTrusted = isTrusted.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMProgressEvent_typekey")(MSHTMLDotDOMProgressEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMProgressEvent]
  }
  @scala.inline
  implicit class DOMProgressEventOps[Self <: DOMProgressEvent] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotDOMProgressEvent_typekey(value: DOMProgressEvent): Self = this.set("MSHTML.DOMProgressEvent_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: Double): Self = this.set("eventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = this.set("initEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setInitProgressEvent(value: (String, Boolean, Boolean, Boolean, Double, Double) => Unit): Self = this.set("initProgressEvent", js.Any.fromFunction6(value))
    @scala.inline
    def setIsTrusted(value: Boolean): Self = this.set("isTrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLengthComputable(value: Boolean): Self = this.set("lengthComputable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = this.set("stopImmediatePropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: IEventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

