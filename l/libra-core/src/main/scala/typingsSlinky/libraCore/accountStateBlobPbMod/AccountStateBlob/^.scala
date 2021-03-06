package typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob, reader: BinaryReader): typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob = js.native
  def serializeBinaryToWriter(message: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateBlob): AsObject = js.native
}

