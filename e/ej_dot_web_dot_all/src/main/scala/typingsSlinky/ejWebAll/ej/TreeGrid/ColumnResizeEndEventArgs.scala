package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnResizeEndEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the column data in which the resizing started
    */
  var column: js.UndefOr[js.Any] = js.native
  /** Returns the column index in which the resizing started
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /** Returns the column width difference, before and after the resizing
    */
  var extra: js.UndefOr[Double] = js.native
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** Returns the new column width after resized
    */
  var newWidth: js.UndefOr[Double] = js.native
  /** Returns column width before dragging
    */
  var oldWidth: js.UndefOr[Double] = js.native
  /** Returns initial column element object.
    */
  var target: js.UndefOr[js.Any] = js.native
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object ColumnResizeEndEventArgs {
  @scala.inline
  def apply(): ColumnResizeEndEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnResizeEndEventArgs]
  }
  @scala.inline
  implicit class ColumnResizeEndEventArgsOps[Self <: ColumnResizeEndEventArgs] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setExtra(value: Double): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNewWidth(value: Double): Self = this.set("newWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewWidth: Self = this.set("newWidth", js.undefined)
    @scala.inline
    def setOldWidth(value: Double): Self = this.set("oldWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldWidth: Self = this.set("oldWidth", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

