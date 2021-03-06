package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRenderbuffer extends js.Object {
  val __WebGLRenderbuffer: Unit = js.native
}

object WebGLRenderbuffer {
  @scala.inline
  def apply(__WebGLRenderbuffer: Unit): WebGLRenderbuffer = {
    val __obj = js.Dynamic.literal(__WebGLRenderbuffer = __WebGLRenderbuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderbuffer]
  }
  @scala.inline
  implicit class WebGLRenderbufferOps[Self <: WebGLRenderbuffer] (val x: Self) extends AnyVal {
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
    def set__WebGLRenderbuffer(value: Unit): Self = this.set("__WebGLRenderbuffer", value.asInstanceOf[js.Any])
  }
  
}

