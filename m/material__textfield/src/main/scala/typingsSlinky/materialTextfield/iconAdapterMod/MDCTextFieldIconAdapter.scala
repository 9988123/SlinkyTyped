package typingsSlinky.materialTextfield.iconAdapterMod

import typingsSlinky.materialBase.typesMod.EventType
import typingsSlinky.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTextFieldIconAdapter extends js.Object {
  /**
    * Deregisters an event listener on the icon element for a given event.
    */
  def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Gets the value of an attribute on the icon element.
    */
  def getAttr(attr: String): String | Null = js.native
  /**
    * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
    */
  def notifyIconAction(): Unit = js.native
  /**
    * Registers an event listener on the icon element for a given event.
    */
  def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Removes an attribute from the icon element.
    */
  def removeAttr(attr: String): Unit = js.native
  /**
    * Sets an attribute on the icon element.
    */
  def setAttr(attr: String, value: String): Unit = js.native
  /**
    * Sets the text content of the icon element.
    */
  def setContent(content: String): Unit = js.native
}

object MDCTextFieldIconAdapter {
  @scala.inline
  def apply(
    deregisterInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    getAttr: String => String | Null,
    notifyIconAction: () => Unit,
    registerInteractionHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    removeAttr: String => Unit,
    setAttr: (String, String) => Unit,
    setContent: String => Unit
  ): MDCTextFieldIconAdapter = {
    val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = js.Any.fromFunction0(notifyIconAction), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), removeAttr = js.Any.fromFunction1(removeAttr), setAttr = js.Any.fromFunction2(setAttr), setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[MDCTextFieldIconAdapter]
  }
  @scala.inline
  implicit class MDCTextFieldIconAdapterOps[Self <: MDCTextFieldIconAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAttr(value: String => String | Null): Self = this.set("getAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyIconAction(value: () => Unit): Self = this.set("notifyIconAction", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterInteractionHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerInteractionHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAttr(value: String => Unit): Self = this.set("removeAttr", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAttr(value: (String, String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
  }
  
}

