package typingsSlinky.serialport.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
  var delimiter: String | Buffer | js.Array[Double] = js.native
  var includeDelimiter: js.UndefOr[Boolean] = js.native
}

object Delimiter {
  @scala.inline
  def apply(delimiter: String | Buffer | js.Array[Double]): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
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
    def setDelimiterVarargs(value: Double*): Self = this.set("delimiter", js.Array(value :_*))
    @scala.inline
    def setDelimiter(value: String | Buffer | js.Array[Double]): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDelimiter(value: Boolean): Self = this.set("includeDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDelimiter: Self = this.set("includeDelimiter", js.undefined)
  }
  
}

