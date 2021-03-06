package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGeocoordinates extends js.Object {
  @JSName("MSHTML.WebGeocoordinates_typekey")
  var MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates = js.native
  val accuracy: Double = js.native
  val altitude: js.Any = js.native
  val altitudeAccuracy: js.Any = js.native
  val heading: js.Any = js.native
  val latitude: Double = js.native
  val longitude: Double = js.native
  val speed: js.Any = js.native
}

object WebGeocoordinates {
  @scala.inline
  def apply(
    MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates,
    accuracy: Double,
    altitude: js.Any,
    altitudeAccuracy: js.Any,
    heading: js.Any,
    latitude: Double,
    longitude: Double,
    speed: js.Any
  ): WebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeocoordinates_typekey")(MSHTMLDotWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeocoordinates]
  }
  @scala.inline
  implicit class WebGeocoordinatesOps[Self <: WebGeocoordinates] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotWebGeocoordinates_typekey(value: WebGeocoordinates): Self = this.set("MSHTML.WebGeocoordinates_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: js.Any): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitudeAccuracy(value: js.Any): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading(value: js.Any): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: js.Any): Self = this.set("speed", value.asInstanceOf[js.Any])
  }
  
}

