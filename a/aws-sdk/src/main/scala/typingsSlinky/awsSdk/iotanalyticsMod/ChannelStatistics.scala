package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStatistics extends js.Object {
  /**
    * The estimated size of the channel.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}

object ChannelStatistics {
  @scala.inline
  def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  @scala.inline
  implicit class ChannelStatisticsOps[Self <: ChannelStatistics] (val x: Self) extends AnyVal {
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
    def setSize(value: EstimatedResourceSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

