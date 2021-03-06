package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageContentCollection object, for use in "pageContentCollection.set({ ... })". */
@js.native
trait PageContentCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageContentData]] = js.native
}

object PageContentCollectionUpdateData {
  @scala.inline
  def apply(): PageContentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionUpdateData]
  }
  @scala.inline
  implicit class PageContentCollectionUpdateDataOps[Self <: PageContentCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: PageContentData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PageContentData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

