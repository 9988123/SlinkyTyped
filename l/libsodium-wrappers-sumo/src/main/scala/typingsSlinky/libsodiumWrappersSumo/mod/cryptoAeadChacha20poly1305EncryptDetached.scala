package typingsSlinky.libsodiumWrappersSumo.mod

import typingsSlinky.libsodiumWrappers.mod.CryptoBox
import typingsSlinky.libsodiumWrappers.mod.StringCryptoBox
import typingsSlinky.libsodiumWrappers.mod.StringOutputFormat
import typingsSlinky.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_aead_chacha20poly1305_encrypt_detached")
@js.native
object cryptoAeadChacha20poly1305EncryptDetached extends js.Object {
  def apply(
    message: String | js.typedarray.Uint8Array,
    additional_data: String | js.typedarray.Uint8Array | Null,
    secret_nonce: String | js.typedarray.Uint8Array | Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: js.UndefOr[Uint8ArrayOutputFormat | Null]
  ): CryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: String,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: String,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: Null,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: String,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: Null,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
  def apply(
    message: js.typedarray.Uint8Array,
    additional_data: js.typedarray.Uint8Array,
    secret_nonce: js.typedarray.Uint8Array,
    public_nonce: js.typedarray.Uint8Array,
    key: js.typedarray.Uint8Array,
    outputFormat: StringOutputFormat
  ): StringCryptoBox = js.native
}

