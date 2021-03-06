package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueIconClues extends js.Object {
  val Count: Double = js.native
  def Clone(): IPropertyValueIconClues = js.native
  def Item(Index: Double): IPropertyValueIconClue = js.native
}

object IPropertyValueIconClues {
  @scala.inline
  def apply(Clone: () => IPropertyValueIconClues, Count: Double, Item: Double => IPropertyValueIconClue): IPropertyValueIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IPropertyValueIconClues]
  }
  @scala.inline
  implicit class IPropertyValueIconCluesOps[Self <: IPropertyValueIconClues] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IPropertyValueIconClues): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IPropertyValueIconClue): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

