package typingsSlinky.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemHover extends js.Object {
  var clearButton: String = js.native
  var column: String = js.native
  var controlLabel: String = js.native
  var item: String = js.native
  var itemChecked: String = js.native
  var itemControl: String = js.native
  var itemDecorator: String = js.native
  var itemDisabled: String = js.native
  var itemHover: String = js.native
  var itemInline: String = js.native
  var label: String = js.native
  var labelChecked: String = js.native
  var materialDecorator: String = js.native
  var other: String = js.native
  var root: String = js.native
}

object ItemHover {
  @scala.inline
  def apply(
    clearButton: String,
    column: String,
    controlLabel: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDecorator: String,
    itemDisabled: String,
    itemHover: String,
    itemInline: String,
    label: String,
    labelChecked: String,
    materialDecorator: String,
    other: String,
    root: String
  ): ItemHover = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], controlLabel = controlLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemHover = itemHover.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelChecked = labelChecked.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemHover]
  }
  @scala.inline
  implicit class ItemHoverOps[Self <: ItemHover] (val x: Self) extends AnyVal {
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
    def setClearButton(value: String): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlLabel(value: String): Self = this.set("controlLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemControl(value: String): Self = this.set("itemControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDecorator(value: String): Self = this.set("itemDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDisabled(value: String): Self = this.set("itemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemHover(value: String): Self = this.set("itemHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemInline(value: String): Self = this.set("itemInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelChecked(value: String): Self = this.set("labelChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterialDecorator(value: String): Self = this.set("materialDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

