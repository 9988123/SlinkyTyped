package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisWordCollection object, for use in "inkAnalysisWordCollection.set({ ... })". */
@js.native
trait InkAnalysisWordCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisWordData]] = js.native
}

object InkAnalysisWordCollectionUpdateData {
  @scala.inline
  def apply(): InkAnalysisWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordCollectionUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisWordCollectionUpdateDataOps[Self <: InkAnalysisWordCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: InkAnalysisWordData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[InkAnalysisWordData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

