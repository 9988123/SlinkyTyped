package typingsSlinky.stripejs.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiiTokenData extends js.Object {
  /**
    * The personal ID number
    */
  var personal_id_number: String = js.native
}

object PiiTokenData {
  @scala.inline
  def apply(personal_id_number: String): PiiTokenData = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiiTokenData]
  }
  @scala.inline
  implicit class PiiTokenDataOps[Self <: PiiTokenData] (val x: Self) extends AnyVal {
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
    def setPersonal_id_number(value: String): Self = this.set("personal_id_number", value.asInstanceOf[js.Any])
  }
  
}

