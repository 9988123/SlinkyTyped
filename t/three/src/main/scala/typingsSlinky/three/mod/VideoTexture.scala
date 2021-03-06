package typingsSlinky.three.mod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "VideoTexture")
@js.native
class VideoTexture protected ()
  extends typingsSlinky.three.videoTextureMod.VideoTexture {
  def this(
    video: HTMLVideoElement,
    mapping: js.UndefOr[typingsSlinky.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsSlinky.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsSlinky.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsSlinky.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsSlinky.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

