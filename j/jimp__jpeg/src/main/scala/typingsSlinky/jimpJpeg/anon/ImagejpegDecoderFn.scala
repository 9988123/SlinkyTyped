package typingsSlinky.jimpJpeg.anon

import typingsSlinky.jimpCore.etcMod.Bitmap
import typingsSlinky.jimpCore.etcMod.DecoderFn
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagejpegDecoderFn extends js.Object {
  @JSName("image/jpeg")
  var imageSlashjpeg_Original: DecoderFn = js.native
  @JSName("image/jpeg")
  def imageSlashjpeg(data: Buffer): Bitmap = js.native
}

