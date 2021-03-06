package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSplitShard extends js.Object {
  /** DEPRECATED */
  var derivationMode: js.UndefOr[String] = js.native
  /** DEPRECATED */
  var source: js.UndefOr[Source] = js.native
}

object SourceSplitShard {
  @scala.inline
  def apply(): SourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitShard]
  }
  @scala.inline
  implicit class SourceSplitShardOps[Self <: SourceSplitShard] (val x: Self) extends AnyVal {
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
    def setDerivationMode(value: String): Self = this.set("derivationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerivationMode: Self = this.set("derivationMode", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

