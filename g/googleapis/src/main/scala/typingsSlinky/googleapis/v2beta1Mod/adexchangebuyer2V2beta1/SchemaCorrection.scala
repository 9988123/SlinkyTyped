package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly Shows any corrections that were applied to this creative.
  */
@js.native
trait SchemaCorrection extends js.Object {
  /**
    * The contexts for the correction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.native
  /**
    * Additional details about what was corrected.
    */
  var details: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of correction that was applied to the creative.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaCorrection {
  @scala.inline
  def apply(): SchemaCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorrection]
  }
  @scala.inline
  implicit class SchemaCorrectionOps[Self <: SchemaCorrection] (val x: Self) extends AnyVal {
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
    def setContextsVarargs(value: SchemaServingContext*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[SchemaServingContext]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    @scala.inline
    def setDetailsVarargs(value: String*): Self = this.set("details", js.Array(value :_*))
    @scala.inline
    def setDetails(value: js.Array[String]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

