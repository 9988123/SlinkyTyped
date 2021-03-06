package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditChangesSaving event.
  */
@js.native
trait ASPxClientGridViewBatchEditChangesSavingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var deletedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  var insertedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  var updatedValues: js.Any = js.native
}

object ASPxClientGridViewBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, deletedValues: js.Any, insertedValues: js.Any, updatedValues: js.Any): ASPxClientGridViewBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditChangesSavingEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewBatchEditChangesSavingEventArgsOps[Self <: ASPxClientGridViewBatchEditChangesSavingEventArgs] (val x: Self) extends AnyVal {
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
    def setDeletedValues(value: js.Any): Self = this.set("deletedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertedValues(value: js.Any): Self = this.set("insertedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedValues(value: js.Any): Self = this.set("updatedValues", value.asInstanceOf[js.Any])
  }
  
}

