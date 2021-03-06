package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegCurvetoCubicSmoothAbs extends js.Object {
  @JSName("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")
  var MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object ISVGPathSegCurvetoCubicSmoothAbs {
  @scala.inline
  def apply(
    MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey: ISVGPathSegCurvetoCubicSmoothAbs,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): ISVGPathSegCurvetoCubicSmoothAbs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey")(MSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegCurvetoCubicSmoothAbs]
  }
  @scala.inline
  implicit class ISVGPathSegCurvetoCubicSmoothAbsOps[Self <: ISVGPathSegCurvetoCubicSmoothAbs] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegCurvetoCubicSmoothAbs_typekey(value: ISVGPathSegCurvetoCubicSmoothAbs): Self = this.set("MSHTML.ISVGPathSegCurvetoCubicSmoothAbs_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}

