package typingsSlinky.reactstrap.toastMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactstrap.fadeMod.FadeProps
import typingsSlinky.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var innerRef: js.UndefOr[Ref[HTMLElement]] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  var transition: js.UndefOr[FadeProps] = js.native
}

object ToastProps {
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  @scala.inline
  implicit class ToastPropsOps[Self <: ToastProps] (val x: Self) extends AnyVal {
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setInnerRefRefObject(value: ReactRef[HTMLElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setTagFunctionComponent(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagComponentClass(value: ReactComponentClass[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTransition(value: FadeProps): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

