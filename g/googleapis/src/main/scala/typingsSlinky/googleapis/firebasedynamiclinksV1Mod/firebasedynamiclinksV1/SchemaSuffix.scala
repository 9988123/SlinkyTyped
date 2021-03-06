package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Short Dynamic Link suffix.
  */
@js.native
trait SchemaSuffix extends js.Object {
  /**
    * Only applies to Option.CUSTOM.
    */
  var customSuffix: js.UndefOr[String] = js.native
  /**
    * Suffix option.
    */
  var option: js.UndefOr[String] = js.native
}

object SchemaSuffix {
  @scala.inline
  def apply(): SchemaSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuffix]
  }
  @scala.inline
  implicit class SchemaSuffixOps[Self <: SchemaSuffix] (val x: Self) extends AnyVal {
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
    def setCustomSuffix(value: String): Self = this.set("customSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSuffix: Self = this.set("customSuffix", js.undefined)
    @scala.inline
    def setOption(value: String): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
  }
  
}

