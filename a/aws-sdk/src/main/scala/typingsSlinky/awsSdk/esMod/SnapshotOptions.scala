package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptions extends js.Object {
  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is 0 hours.
    */
  var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.native
}

object SnapshotOptions {
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
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
    def setAutomatedSnapshotStartHour(value: IntegerClass): Self = this.set("AutomatedSnapshotStartHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomatedSnapshotStartHour: Self = this.set("AutomatedSnapshotStartHour", js.undefined)
  }
  
}

