package typingsSlinky.jimpPng.anon

import typingsSlinky.jimpCore.etcMod.EncoderFn
import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagepngEncoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: EncoderFn[Image] = js.native
  @JSName("image/png")
  def imageSlashpng(image: Image): Buffer = js.native
}

