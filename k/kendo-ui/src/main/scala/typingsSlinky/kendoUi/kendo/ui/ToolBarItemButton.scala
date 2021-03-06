package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolBarItemButton extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var click: js.UndefOr[js.Function] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[String] = js.native
  var showText: js.UndefOr[String] = js.native
  var spriteCssClass: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var togglable: js.UndefOr[Boolean] = js.native
  var toggle: js.UndefOr[js.Function] = js.native
  var url: js.UndefOr[String] = js.native
}

object ToolBarItemButton {
  @scala.inline
  def apply(): ToolBarItemButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarItemButton]
  }
  @scala.inline
  implicit class ToolBarItemButtonOps[Self <: ToolBarItemButton] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShowIcon(value: String): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    @scala.inline
    def setShowText(value: String): Self = this.set("showText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpriteCssClass: Self = this.set("spriteCssClass", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTogglable(value: Boolean): Self = this.set("togglable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTogglable: Self = this.set("togglable", js.undefined)
    @scala.inline
    def setToggle(value: js.Function): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

