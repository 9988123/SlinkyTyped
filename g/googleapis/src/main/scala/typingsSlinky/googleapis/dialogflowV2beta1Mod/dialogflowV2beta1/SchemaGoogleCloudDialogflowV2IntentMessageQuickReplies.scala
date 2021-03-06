package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The quick replies response message.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies extends js.Object {
  /**
    * Optional. The collection of quick replies.
    */
  var quickReplies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The title of the collection of quick replies.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentMessageQuickRepliesOps[Self <: SchemaGoogleCloudDialogflowV2IntentMessageQuickReplies] (val x: Self) extends AnyVal {
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
    def setQuickRepliesVarargs(value: String*): Self = this.set("quickReplies", js.Array(value :_*))
    @scala.inline
    def setQuickReplies(value: js.Array[String]): Self = this.set("quickReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickReplies: Self = this.set("quickReplies", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

