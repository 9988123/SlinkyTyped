package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDevices`.
  */
@js.native
trait SchemaListDevicesResponse extends js.Object {
  /**
    * The devices that match the request.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * If not empty, indicates that there may be more devices that match the
    * request; this value should be passed in a new `ListDevicesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDevicesResponse {
  @scala.inline
  def apply(): SchemaListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDevicesResponse]
  }
  @scala.inline
  implicit class SchemaListDevicesResponseOps[Self <: SchemaListDevicesResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: SchemaDevice*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[SchemaDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

