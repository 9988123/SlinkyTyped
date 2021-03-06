package typingsSlinky.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaCardRule extends js.Object {
  var items: js.Array[Path] = js.native
  var maxItems: js.Array[Double] = js.native
  var minItems: js.Array[Double] = js.native
}

object MetaCardRule {
  @scala.inline
  def apply(items: js.Array[Path], maxItems: js.Array[Double], minItems: js.Array[Double]): MetaCardRule = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCardRule]
  }
  @scala.inline
  implicit class MetaCardRuleOps[Self <: MetaCardRule] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Path*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Path]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxItemsVarargs(value: Double*): Self = this.set("maxItems", js.Array(value :_*))
    @scala.inline
    def setMaxItems(value: js.Array[Double]): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinItemsVarargs(value: Double*): Self = this.set("minItems", js.Array(value :_*))
    @scala.inline
    def setMinItems(value: js.Array[Double]): Self = this.set("minItems", value.asInstanceOf[js.Any])
  }
  
}

