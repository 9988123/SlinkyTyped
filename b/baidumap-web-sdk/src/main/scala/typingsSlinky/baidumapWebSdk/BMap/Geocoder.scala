package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocoder extends js.Object {
  def getLocation(point: Point, callback: js.Function1[/* result */ GeocoderResult, Unit]): Unit = js.native
  def getLocation(point: Point, callback: js.Function1[/* result */ GeocoderResult, Unit], opts: LocationOptions): Unit = js.native
  def getPoint(address: String, callback: js.Function1[/* point */ Point, Unit], city: String): Unit = js.native
}

