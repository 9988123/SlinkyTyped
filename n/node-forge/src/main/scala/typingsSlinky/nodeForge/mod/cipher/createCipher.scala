package typingsSlinky.nodeForge.mod.cipher

import typingsSlinky.nodeForge.mod.Bytes
import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "cipher.createCipher")
@js.native
object createCipher extends js.Object {
  def apply(algorithm: Algorithm, payload: Bytes): BlockCipher = js.native
  def apply(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = js.native
}

