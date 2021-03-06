package typingsSlinky.stylus.anon

import typingsSlinky.stylus.mod.Stylus.Nodes.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var __type: String = js.native
  var body: typingsSlinky.stylus.mod.Stylus.Nodes.Block = js.native
  var column: Double = js.native
  var filename: String = js.native
  var lineno: Double = js.native
  var name: String = js.native
  var params: Params = js.native
}

object Body {
  @scala.inline
  def apply(
    __type: String,
    body: typingsSlinky.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    filename: String,
    lineno: Double,
    name: String,
    params: Params
  ): Body = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def set__type(value: String): Self = this.set("__type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: typingsSlinky.stylus.mod.Stylus.Nodes.Block): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

