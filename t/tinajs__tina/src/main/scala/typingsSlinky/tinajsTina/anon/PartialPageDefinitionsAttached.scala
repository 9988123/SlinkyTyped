package typingsSlinky.tinajsTina.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.tinajsTina.mod.Component
import typingsSlinky.tinajsTina.mod.ComponentProperties
import typingsSlinky.tinajsTina.mod.PageDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
@js.native
trait PartialPageDefinitionsAttached extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.native
  var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* options */ js.UndefOr[js.Any], Unit]] = js.native
  var onPageScroll: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
  var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
  var onReachBottom: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
  var onReady: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onShareAppMessage: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var onUnload: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
  var properties: js.UndefOr[ComponentProperties] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialPageDefinitionsAttached {
  @scala.inline
  def apply(): PartialPageDefinitionsAttached = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageDefinitionsAttached]
  }
  @scala.inline
  implicit class PartialPageDefinitionsAttachedOps[Self <: PartialPageDefinitionsAttached] (val x: Self) extends AnyVal {
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setBeforeLoad(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = this.set("beforeLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeLoad: Self = this.set("beforeLoad", js.undefined)
    @scala.inline
    def setCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = this.set("compute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompute: Self = this.set("compute", js.undefined)
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setMixinsVarargs(value: Partial[PageDefinitions]*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[Partial[PageDefinitions]]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    @scala.inline
    def setOnHide(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnLoad(value: js.ThisFunction1[PartialPageDefinitionsAttached, /* options */ js.UndefOr[js.Any], Unit]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnPageScroll(value: PartialPageDefinitionsAttached => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    @scala.inline
    def setOnPullDownRefresh(value: PartialPageDefinitionsAttached => Unit): Self = this.set("onPullDownRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPullDownRefresh: Self = this.set("onPullDownRefresh", js.undefined)
    @scala.inline
    def setOnReachBottom(value: PartialPageDefinitionsAttached => Unit): Self = this.set("onReachBottom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReachBottom: Self = this.set("onReachBottom", js.undefined)
    @scala.inline
    def setOnReady(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = this.set("onReady", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnShareAppMessage(value: PartialPageDefinitionsAttached => Unit): Self = this.set("onShareAppMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShareAppMessage: Self = this.set("onShareAppMessage", js.undefined)
    @scala.inline
    def setOnShow(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnUnload(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = this.set("onUnload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
    @scala.inline
    def setProperties(value: ComponentProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

