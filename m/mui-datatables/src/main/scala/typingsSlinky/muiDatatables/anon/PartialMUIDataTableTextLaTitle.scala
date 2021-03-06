package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsViewColumns> */
@js.native
trait PartialMUIDataTableTextLaTitle extends js.Object {
  var title: js.UndefOr[String] = js.native
  var titleAria: js.UndefOr[String] = js.native
}

object PartialMUIDataTableTextLaTitle {
  @scala.inline
  def apply(): PartialMUIDataTableTextLaTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaTitle]
  }
  @scala.inline
  implicit class PartialMUIDataTableTextLaTitleOps[Self <: PartialMUIDataTableTextLaTitle] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAria(value: String): Self = this.set("titleAria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAria: Self = this.set("titleAria", js.undefined)
  }
  
}

