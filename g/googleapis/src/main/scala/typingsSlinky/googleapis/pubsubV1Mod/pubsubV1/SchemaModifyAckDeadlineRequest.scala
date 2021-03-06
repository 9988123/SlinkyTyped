package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyAckDeadline method.
  */
@js.native
trait SchemaModifyAckDeadlineRequest extends js.Object {
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. For example, if the value is 10, the new ack deadline
    * will expire 10 seconds after the `ModifyAckDeadline` call was made.
    * Specifying zero might immediately make the message available for delivery
    * to another subscriber client. This typically results in an increase in
    * the rate of message redeliveries (that is, duplicates). The minimum
    * deadline you can specify is 0 seconds. The maximum deadline you can
    * specify is 600 seconds (10 minutes).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * List of acknowledgment IDs.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyAckDeadlineRequest {
  @scala.inline
  def apply(): SchemaModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyAckDeadlineRequest]
  }
  @scala.inline
  implicit class SchemaModifyAckDeadlineRequestOps[Self <: SchemaModifyAckDeadlineRequest] (val x: Self) extends AnyVal {
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
    def setAckDeadlineSeconds(value: Double): Self = this.set("ackDeadlineSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckDeadlineSeconds: Self = this.set("ackDeadlineSeconds", js.undefined)
    @scala.inline
    def setAckIdsVarargs(value: String*): Self = this.set("ackIds", js.Array(value :_*))
    @scala.inline
    def setAckIds(value: js.Array[String]): Self = this.set("ackIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckIds: Self = this.set("ackIds", js.undefined)
  }
  
}

