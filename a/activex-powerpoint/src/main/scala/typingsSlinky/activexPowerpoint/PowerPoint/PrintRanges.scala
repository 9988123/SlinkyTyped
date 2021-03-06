package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintRanges extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PrintRanges_typekey")
  var PowerPointDotPrintRanges_typekey: PrintRanges = js.native
  def Add(Start: Double, End: Double): PrintRange = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: Double): PrintRange = js.native
}

object PrintRanges {
  @scala.inline
  def apply(
    Add: (Double, Double) => PrintRange,
    Application: Application,
    ClearAll: () => Unit,
    Count: Double,
    Item: Double => PrintRange,
    Parent: js.Any,
    PowerPointDotPrintRanges_typekey: PrintRanges
  ): PrintRanges = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], ClearAll = js.Any.fromFunction0(ClearAll), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRanges_typekey")(PowerPointDotPrintRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRanges]
  }
  @scala.inline
  implicit class PrintRangesOps[Self <: PrintRanges] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, Double) => PrintRange): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearAll(value: () => Unit): Self = this.set("ClearAll", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => PrintRange): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotPrintRanges_typekey(value: PrintRanges): Self = this.set("PowerPoint.PrintRanges_typekey", value.asInstanceOf[js.Any])
  }
  
}

