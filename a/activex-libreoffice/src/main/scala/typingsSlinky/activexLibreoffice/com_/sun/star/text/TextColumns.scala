package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to columns in text (e.g., in {@link TextFrames} ). */
@js.native
trait TextColumns extends XTextColumns {
  /**
    * contains the distance between the columns. It is valid if the property IsAutomatic is set. Half of this distance is set to the left and right margins
    * of all columns, except for the left margin of the first column, and the right margin of the last column.
    */
  var AutomaticDistance: Double = js.native
  /**
    * determines whether the columns all have equal width. This flag is set if {@link XTextColumns.setColumnCount()} is called and it is reset if {@link
    * XTextColumns.setColumns()} is called.
    */
  var IsAutomatic: Boolean = js.native
  /** determines the color of the separator lines between the columns. */
  var SeparatorLineColor: Color = js.native
  /** determines whether separator lines are on. */
  var SeparatorLineIsOn: Boolean = js.native
  /** determines the relative height of the separator lines between the columns. */
  var SeparatorLineRelativeHeight: Double = js.native
  /**
    * determines the style of the separator lines between the columns.
    * @see com.sun.star.text:ColumnSeparatorStyle for the possible values.
    */
  var SeparatorLineStyle: Double = js.native
  /** determines the vertical alignment of the separator lines between the columns. */
  var SeparatorLineVerticalAlignment: VerticalAlignment = js.native
  /** determines the width of the separator lines between the columns. */
  var SeparatorLineWidth: Double = js.native
}

object TextColumns {
  @scala.inline
  def apply(
    AutomaticDistance: Double,
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    IsAutomatic: Boolean,
    ReferenceValue: Double,
    SeparatorLineColor: Color,
    SeparatorLineIsOn: Boolean,
    SeparatorLineRelativeHeight: Double,
    SeparatorLineStyle: Double,
    SeparatorLineVerticalAlignment: VerticalAlignment,
    SeparatorLineWidth: Double,
    acquire: () => Unit,
    getColumnCount: () => Double,
    getColumns: () => SafeArray[TextColumn],
    getReferenceValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColumnCount: Double => Unit,
    setColumns: SeqEquiv[TextColumn] => Unit
  ): TextColumns = {
    val __obj = js.Dynamic.literal(AutomaticDistance = AutomaticDistance.asInstanceOf[js.Any], ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], ReferenceValue = ReferenceValue.asInstanceOf[js.Any], SeparatorLineColor = SeparatorLineColor.asInstanceOf[js.Any], SeparatorLineIsOn = SeparatorLineIsOn.asInstanceOf[js.Any], SeparatorLineRelativeHeight = SeparatorLineRelativeHeight.asInstanceOf[js.Any], SeparatorLineStyle = SeparatorLineStyle.asInstanceOf[js.Any], SeparatorLineVerticalAlignment = SeparatorLineVerticalAlignment.asInstanceOf[js.Any], SeparatorLineWidth = SeparatorLineWidth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), getReferenceValue = js.Any.fromFunction0(getReferenceValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumnCount = js.Any.fromFunction1(setColumnCount), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[TextColumns]
  }
  @scala.inline
  implicit class TextColumnsOps[Self <: TextColumns] (val x: Self) extends AnyVal {
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
    def setAutomaticDistance(value: Double): Self = this.set("AutomaticDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAutomatic(value: Boolean): Self = this.set("IsAutomatic", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineColor(value: Color): Self = this.set("SeparatorLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineIsOn(value: Boolean): Self = this.set("SeparatorLineIsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineRelativeHeight(value: Double): Self = this.set("SeparatorLineRelativeHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineStyle(value: Double): Self = this.set("SeparatorLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineVerticalAlignment(value: VerticalAlignment): Self = this.set("SeparatorLineVerticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparatorLineWidth(value: Double): Self = this.set("SeparatorLineWidth", value.asInstanceOf[js.Any])
  }
  
}

