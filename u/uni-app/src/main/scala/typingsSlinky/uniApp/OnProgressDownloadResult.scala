package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnProgressDownloadResult extends js.Object {
  /**
    * 下载进度百分比
    */
  var progress: js.UndefOr[Double] = js.native
  /**
    * 预期需要下载的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToWrite: js.UndefOr[Double] = js.native
  /**
    * 已经下载的数据长度，单位 Bytes
    */
  var totalBytesWritten: js.UndefOr[Double] = js.native
}

object OnProgressDownloadResult {
  @scala.inline
  def apply(): OnProgressDownloadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnProgressDownloadResult]
  }
  @scala.inline
  implicit class OnProgressDownloadResultOps[Self <: OnProgressDownloadResult] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setTotalBytesExpectedToWrite(value: Double): Self = this.set("totalBytesExpectedToWrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesExpectedToWrite: Self = this.set("totalBytesExpectedToWrite", js.undefined)
    @scala.inline
    def setTotalBytesWritten(value: Double): Self = this.set("totalBytesWritten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalBytesWritten: Self = this.set("totalBytesWritten", js.undefined)
  }
  
}

