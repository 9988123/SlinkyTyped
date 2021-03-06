package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTableChangeList extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): ValueChange = js.native
  def apply(Index: Double): ValueChange = js.native
  def Add(Tuple: String, Value: Double): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: js.UndefOr[scala.Nothing],
    AllocationMethod: js.UndefOr[scala.Nothing],
    AllocationWeightExpression: js.Any
  ): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: js.UndefOr[scala.Nothing], AllocationMethod: js.Any): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: js.UndefOr[scala.Nothing],
    AllocationMethod: js.Any,
    AllocationWeightExpression: js.Any
  ): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: js.Any): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: js.Any,
    AllocationMethod: js.UndefOr[scala.Nothing],
    AllocationWeightExpression: js.Any
  ): ValueChange = js.native
  def Add(Tuple: String, Value: Double, AllocationValue: js.Any, AllocationMethod: js.Any): ValueChange = js.native
  def Add(
    Tuple: String,
    Value: Double,
    AllocationValue: js.Any,
    AllocationMethod: js.Any,
    AllocationWeightExpression: js.Any
  ): ValueChange = js.native
  def Item(Index: String): ValueChange = js.native
  def Item(Index: Double): ValueChange = js.native
  def _Default(Index: js.Any): ValueChange = js.native
}

