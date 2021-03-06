package typingsSlinky.rawBody.anon

import typingsSlinky.rawBody.mod.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined raw-body.raw-body.Options & {  encoding :raw-body.raw-body.Encoding} */
@js.native
trait OptionsencodingEncoding extends js.Object {
  /**
    * The encoding to use to decode the body into a string. By default, a
    * `Buffer` instance will be returned when no encoding is specified. Most
    * likely, you want `utf-8`, so setting encoding to `true` will decode as
    * `utf-8`. You can use any type of encoding supported by `iconv-lite`.
    */
  var encoding: (js.UndefOr[Encoding | Null]) with Encoding = js.native
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[Double | String | Null] = js.native
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var limit: js.UndefOr[Double | String | Null] = js.native
}

object OptionsencodingEncoding {
  @scala.inline
  def apply(encoding: (js.UndefOr[Encoding | Null]) with Encoding): OptionsencodingEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsencodingEncoding]
  }
  @scala.inline
  implicit class OptionsencodingEncodingOps[Self <: OptionsencodingEncoding] (val x: Self) extends AnyVal {
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
    def setEncoding(value: (js.UndefOr[Encoding | Null]) with Encoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double | String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLengthNull: Self = this.set("length", null)
    @scala.inline
    def setLimit(value: Double | String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLimitNull: Self = this.set("limit", null)
  }
  
}

