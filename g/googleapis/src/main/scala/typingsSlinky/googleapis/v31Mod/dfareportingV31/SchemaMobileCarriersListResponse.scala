package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile Carrier List Response
  */
@js.native
trait SchemaMobileCarriersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarriersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Mobile carrier collection.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.native
}

object SchemaMobileCarriersListResponse {
  @scala.inline
  def apply(): SchemaMobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarriersListResponse]
  }
  @scala.inline
  implicit class SchemaMobileCarriersListResponseOps[Self <: SchemaMobileCarriersListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMobileCarriersVarargs(value: SchemaMobileCarrier*): Self = this.set("mobileCarriers", js.Array(value :_*))
    @scala.inline
    def setMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = this.set("mobileCarriers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileCarriers: Self = this.set("mobileCarriers", js.undefined)
  }
  
}

