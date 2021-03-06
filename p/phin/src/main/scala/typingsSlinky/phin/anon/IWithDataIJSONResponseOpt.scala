package typingsSlinky.phin.anon

import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.phin.phinStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phin.phin.IWithData<phin.phin.IJSONResponseOptions> */
@js.native
trait IWithDataIJSONResponseOpt extends js.Object {
  var compression: js.UndefOr[Boolean] = js.native
  var core: js.UndefOr[ClientRequestArgs] = js.native
  var data: ToString = js.native
  var followRedirects: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var hostname: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var parse: json = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var stream: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
}

object IWithDataIJSONResponseOpt {
  @scala.inline
  def apply(data: ToString, parse: json, url: String): IWithDataIJSONResponseOpt = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWithDataIJSONResponseOpt]
  }
  @scala.inline
  implicit class IWithDataIJSONResponseOptOps[Self <: IWithDataIJSONResponseOpt] (val x: Self) extends AnyVal {
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
    def setData(value: ToString): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setParse(value: json): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCore(value: ClientRequestArgs): Self = this.set("core", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCore: Self = this.set("core", js.undefined)
    @scala.inline
    def setFollowRedirects(value: Boolean): Self = this.set("followRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirects: Self = this.set("followRedirects", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

