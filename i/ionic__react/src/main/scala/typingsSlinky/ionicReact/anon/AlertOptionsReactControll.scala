package typingsSlinky.ionicReact.anon

import org.scalajs.dom.raw.CustomEvent
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.alertInterfaceMod.AlertButton
import typingsSlinky.ionicCore.alertInterfaceMod.AlertInput
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonAlertElement
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/core.@ionic/core.AlertOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonAlertElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonAlertElement> */
@js.native
trait AlertOptionsReactControll extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var forwardedRef: js.UndefOr[ReactRef[HTMLIonAlertElement]] = js.native
  var header: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.native
  var isOpen: Boolean = js.native
  var key: js.UndefOr[Key] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var message: js.UndefOr[String | IonicSafeString] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  var ref: js.UndefOr[Ref[HTMLIonAlertElement]] = js.native
  var subHeader: js.UndefOr[String] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
}

object AlertOptionsReactControll {
  @scala.inline
  def apply(isOpen: Boolean): AlertOptionsReactControll = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptionsReactControll]
  }
  @scala.inline
  implicit class AlertOptionsReactControllOps[Self <: AlertOptionsReactControll] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: (AlertButton | String)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[AlertButton | String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setForwardedRef(value: ReactRef[HTMLIonAlertElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputsVarargs(value: AlertInput*): Self = this.set("inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: js.Array[AlertInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMessage(value: String | IonicSafeString): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnDidDismiss(value: /* event */ CustomEvent => Unit): Self = this.set("onDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidDismiss: Self = this.set("onDidDismiss", js.undefined)
    @scala.inline
    def setOnDidPresent(value: /* event */ CustomEvent => Unit): Self = this.set("onDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidPresent: Self = this.set("onDidPresent", js.undefined)
    @scala.inline
    def setOnWillDismiss(value: /* event */ CustomEvent => Unit): Self = this.set("onWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillDismiss: Self = this.set("onWillDismiss", js.undefined)
    @scala.inline
    def setOnWillPresent(value: /* event */ CustomEvent => Unit): Self = this.set("onWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillPresent: Self = this.set("onWillPresent", js.undefined)
    @scala.inline
    def setRefRefObject(value: ReactRef[HTMLIonAlertElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonAlertElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLIonAlertElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setSubHeader(value: String): Self = this.set("subHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubHeader: Self = this.set("subHeader", js.undefined)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
  
}

