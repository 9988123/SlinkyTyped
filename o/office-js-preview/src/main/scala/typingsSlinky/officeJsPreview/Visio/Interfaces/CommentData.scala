package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "comment.toJSON()". */
@js.native
trait CommentData extends js.Object {
  /**
    *
    * A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: js.UndefOr[String] = js.native
  /**
    *
    * A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: js.UndefOr[String] = js.native
  /**
    *
    * A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[String] = js.native
}

object CommentData {
  @scala.inline
  def apply(): CommentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentData]
  }
  @scala.inline
  implicit class CommentDataOps[Self <: CommentData] (val x: Self) extends AnyVal {
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

