package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.high
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.low
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressVideoOption extends js.Object {
  /** 码率，单位 kbps */
  var bitrate: Double = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CompressVideoCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CompressVideoFailCallback] = js.native
  /** 帧率 */
  var fps: Double = js.native
  /** 压缩质量
    *
    * 可选值：
    * - 'low': 低;
    * - 'medium': 中;
    * - 'high': 高; */
  var quality: low | medium | high = js.native
  /** 相对于原视频的分辨率比例，取值范围(0, 1] */
  var resolution: Double = js.native
  /** 视频文件路径，可以是临时文件路径也可以是永久文件路径 */
  var src: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CompressVideoSuccessCallback] = js.native
}

object CompressVideoOption {
  @scala.inline
  def apply(bitrate: Double, fps: Double, quality: low | medium | high, resolution: Double, src: String): CompressVideoOption = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressVideoOption]
  }
  @scala.inline
  implicit class CompressVideoOptionOps[Self <: CompressVideoOption] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: low | medium | high): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ CompressVideoSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

