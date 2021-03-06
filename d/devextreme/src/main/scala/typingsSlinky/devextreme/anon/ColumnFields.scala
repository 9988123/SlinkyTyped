package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFields extends js.Object {
  var area: js.UndefOr[String] = js.native
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.native
  var cellElement: js.UndefOr[dxElement] = js.native
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var columnIndex: js.UndefOr[Double] = js.native
  var component: js.UndefOr[dxPivotGrid] = js.native
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var field: js.UndefOr[PivotGridDataSourceField] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

object ColumnFields {
  @scala.inline
  def apply(): ColumnFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFields]
  }
  @scala.inline
  implicit class ColumnFieldsOps[Self <: ColumnFields] (val x: Self) extends AnyVal {
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
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setCell(value: dxPivotGridPivotGridCell): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCellElement(value: dxElement): Self = this.set("cellElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellElement: Self = this.set("cellElement", js.undefined)
    @scala.inline
    def setColumnFieldsVarargs(value: PivotGridDataSourceField*): Self = this.set("columnFields", js.Array(value :_*))
    @scala.inline
    def setColumnFields(value: js.Array[PivotGridDataSourceField]): Self = this.set("columnFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnFields: Self = this.set("columnFields", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setComponent(value: dxPivotGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDataFieldsVarargs(value: PivotGridDataSourceField*): Self = this.set("dataFields", js.Array(value :_*))
    @scala.inline
    def setDataFields(value: js.Array[PivotGridDataSourceField]): Self = this.set("dataFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFields: Self = this.set("dataFields", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setField(value: PivotGridDataSourceField): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setRowFieldsVarargs(value: PivotGridDataSourceField*): Self = this.set("rowFields", js.Array(value :_*))
    @scala.inline
    def setRowFields(value: js.Array[PivotGridDataSourceField]): Self = this.set("rowFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFields: Self = this.set("rowFields", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

