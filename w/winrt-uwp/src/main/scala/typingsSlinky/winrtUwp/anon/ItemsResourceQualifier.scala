package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceQualifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsResourceQualifier extends js.Object {
  /** The objects in the view that start at startIndex. */ var items: ResourceQualifier = js.native
  /** The number of objects returned. */ var returnValue: Double = js.native
}

object ItemsResourceQualifier {
  @scala.inline
  def apply(items: ResourceQualifier, returnValue: Double): ItemsResourceQualifier = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsResourceQualifier]
  }
  @scala.inline
  implicit class ItemsResourceQualifierOps[Self <: ItemsResourceQualifier] (val x: Self) extends AnyVal {
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
    def setItems(value: ResourceQualifier): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

