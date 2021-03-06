package typingsSlinky.libsodiumWrappers.mod

import typingsSlinky.libsodiumWrappers.anon.Header
import typingsSlinky.libsodiumWrappers.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_secretstream_xchacha20poly1305_init_push")
@js.native
object cryptoSecretstreamXchacha20poly1305InitPush extends js.Object {
  def apply(key: js.typedarray.Uint8Array): Header = js.native
  def apply(key: js.typedarray.Uint8Array, outputFormat: StringOutputFormat): State = js.native
  def apply(key: js.typedarray.Uint8Array, outputFormat: Uint8ArrayOutputFormat): Header = js.native
}

