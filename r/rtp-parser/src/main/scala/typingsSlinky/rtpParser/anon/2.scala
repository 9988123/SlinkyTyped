package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserStrings.JPEG
import typingsSlinky.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `2` extends js.Object {
  var clockRate: `90000` = js.native
  var mediaType: V = js.native
  var name: JPEG = js.native
}

object `2` {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: JPEG): `2` = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
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
    def setClockRate(value: `90000`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: V): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: JPEG): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

