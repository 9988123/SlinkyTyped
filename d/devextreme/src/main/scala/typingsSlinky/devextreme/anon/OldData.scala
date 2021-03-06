package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxScheduler
import typingsSlinky.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldData extends js.Object {
  var cancel: js.UndefOr[
    Boolean | typingsSlinky.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.native
  var component: js.UndefOr[dxScheduler] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var newData: js.UndefOr[js.Any] = js.native
  var oldData: js.UndefOr[js.Any] = js.native
}

object OldData {
  @scala.inline
  def apply(): OldData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldData]
  }
  @scala.inline
  implicit class OldDataOps[Self <: OldData] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean | typingsSlinky.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setComponent(value: dxScheduler): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNewData(value: js.Any): Self = this.set("newData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    @scala.inline
    def setOldData(value: js.Any): Self = this.set("oldData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldData: Self = this.set("oldData", js.undefined)
  }
  
}

