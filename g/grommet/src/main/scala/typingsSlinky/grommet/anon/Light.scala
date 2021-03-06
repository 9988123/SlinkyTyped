package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Light extends js.Object {
  var dark: String | js.Array[String] = js.native
  var light: String | js.Array[String] = js.native
}

object Light {
  @scala.inline
  def apply(dark: String | js.Array[String], light: String | js.Array[String]): Light = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  @scala.inline
  implicit class LightOps[Self <: Light] (val x: Self) extends AnyVal {
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
    def setDarkVarargs(value: String*): Self = this.set("dark", js.Array(value :_*))
    @scala.inline
    def setDark(value: String | js.Array[String]): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightVarargs(value: String*): Self = this.set("light", js.Array(value :_*))
    @scala.inline
    def setLight(value: String | js.Array[String]): Self = this.set("light", value.asInstanceOf[js.Any])
  }
  
}

