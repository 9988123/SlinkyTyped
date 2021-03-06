package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumTransferableSeats extends js.Object {
  var minimumTransferableSeats: js.UndefOr[Double] = js.native
  var transferabilityExpirationTime: js.UndefOr[String] = js.native
}

object MinimumTransferableSeats {
  @scala.inline
  def apply(): MinimumTransferableSeats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumTransferableSeats]
  }
  @scala.inline
  implicit class MinimumTransferableSeatsOps[Self <: MinimumTransferableSeats] (val x: Self) extends AnyVal {
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
    def setMinimumTransferableSeats(value: Double): Self = this.set("minimumTransferableSeats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTransferableSeats: Self = this.set("minimumTransferableSeats", js.undefined)
    @scala.inline
    def setTransferabilityExpirationTime(value: String): Self = this.set("transferabilityExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferabilityExpirationTime: Self = this.set("transferabilityExpirationTime", js.undefined)
  }
  
}

