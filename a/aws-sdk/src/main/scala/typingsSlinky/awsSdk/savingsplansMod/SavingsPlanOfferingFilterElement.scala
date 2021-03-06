package typingsSlinky.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlanOfferingFilterElement extends js.Object {
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanOfferingFilterAttribute] = js.native
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.native
}

object SavingsPlanOfferingFilterElement {
  @scala.inline
  def apply(): SavingsPlanOfferingFilterElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingFilterElement]
  }
  @scala.inline
  implicit class SavingsPlanOfferingFilterElementOps[Self <: SavingsPlanOfferingFilterElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: SavingsPlanOfferingFilterAttribute): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValuesVarargs(value: JsonSafeFilterValueString*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: FilterValuesList): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

