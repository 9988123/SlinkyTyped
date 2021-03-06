package typingsSlinky.ipp.anon

import typingsSlinky.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Requestedattributes extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
    ]
  ] = js.native
}

object Requestedattributes {
  @scala.inline
  def apply(): Requestedattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Requestedattributes]
  }
  @scala.inline
  implicit class RequestedattributesOps[Self <: Requestedattributes] (val x: Self) extends AnyVal {
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
    def `setAttributes-charset`(value: CharacterSet): Self = this.set("attributes-charset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-charset`: Self = this.set("attributes-charset", js.undefined)
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = this.set("attributes-natural-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAttributes-natural-language`: Self = this.set("attributes-natural-language", js.undefined)
    @scala.inline
    def `setJob-id`(value: Double): Self = this.set("job-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-id`: Self = this.set("job-id", js.undefined)
    @scala.inline
    def `setJob-uri`(value: String): Self = this.set("job-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-uri`: Self = this.set("job-uri", js.undefined)
    @scala.inline
    def `setPrinter-uri`(value: String): Self = this.set("printer-uri", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePrinter-uri`: Self = this.set("printer-uri", js.undefined)
    @scala.inline
    def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any)*
    ): Self = this.set("requested-attributes", js.Array(value :_*))
    @scala.inline
    def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 204 */ js.Any
        ]
    ): Self = this.set("requested-attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRequested-attributes`: Self = this.set("requested-attributes", js.undefined)
  }
  
}

