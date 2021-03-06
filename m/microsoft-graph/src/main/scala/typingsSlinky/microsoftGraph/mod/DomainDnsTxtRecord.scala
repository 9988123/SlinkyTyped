package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsTxtRecord extends DomainDnsRecord {
  // Value used when configuring the text property at the DNS host.
  var text: js.UndefOr[String] = js.native
}

object DomainDnsTxtRecord {
  @scala.inline
  def apply(): DomainDnsTxtRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsTxtRecord]
  }
  @scala.inline
  implicit class DomainDnsTxtRecordOps[Self <: DomainDnsTxtRecord] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

