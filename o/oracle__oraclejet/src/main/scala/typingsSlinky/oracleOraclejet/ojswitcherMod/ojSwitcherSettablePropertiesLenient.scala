package typingsSlinky.oracleOraclejet.ojswitcherMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojswitcher.ojSwitcherSettableProperties> */
@js.native
trait ojSwitcherSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var value: js.UndefOr[String] = js.native
}

object ojSwitcherSettablePropertiesLenient {
  @scala.inline
  def apply(): ojSwitcherSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSwitcherSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojSwitcherSettablePropertiesLenientOps[Self <: ojSwitcherSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

