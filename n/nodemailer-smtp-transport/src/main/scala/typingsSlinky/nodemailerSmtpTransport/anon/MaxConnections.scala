package typingsSlinky.nodemailerSmtpTransport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxConnections extends js.Object {
  /**
    * is the count of maximum simultaneous connections to make against the SMTP server (defaults to 5)
    */
  var maxConnections: js.UndefOr[Boolean] = js.native
  /**
    * limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[Boolean] = js.native
  /**
    * set to true to use pooled connections (defaults to false) instead of creating a new connection for every email
    */
  var pool: js.UndefOr[Boolean] = js.native
  /**
    * defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting
    */
  var rateDelta: js.UndefOr[Boolean] = js.native
  /**
    * limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period.
    */
  var rateLimit: js.UndefOr[Boolean] = js.native
}

object MaxConnections {
  @scala.inline
  def apply(): MaxConnections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxConnections]
  }
  @scala.inline
  implicit class MaxConnectionsOps[Self <: MaxConnections] (val x: Self) extends AnyVal {
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
    def setMaxConnections(value: Boolean): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setMaxMessages(value: Boolean): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    @scala.inline
    def setPool(value: Boolean): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setRateDelta(value: Boolean): Self = this.set("rateDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateDelta: Self = this.set("rateDelta", js.undefined)
    @scala.inline
    def setRateLimit(value: Boolean): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
  }
  
}

