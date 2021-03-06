package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiCacheResponse extends js.Object {
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.native
}

object UpdateApiCacheResponse {
  @scala.inline
  def apply(): UpdateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiCacheResponse]
  }
  @scala.inline
  implicit class UpdateApiCacheResponseOps[Self <: UpdateApiCacheResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiCache(value: ApiCache): Self = this.set("apiCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiCache: Self = this.set("apiCache", js.undefined)
  }
  
}

