package typingsSlinky.googleProtobuf.durationPbMod.Duration

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.googleProtobuf.mod.BinaryReader
import typingsSlinky.googleProtobuf.mod.BinaryWriter
import typingsSlinky.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsSlinky.googleProtobuf.mod.ExtensionFieldInfo
import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/duration_pb", "Duration")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: js.typedarray.Uint8Array): typingsSlinky.googleProtobuf.durationPbMod.Duration = js.native
  def deserializeBinaryFromReader(message: typingsSlinky.googleProtobuf.durationPbMod.Duration, reader: BinaryReader): typingsSlinky.googleProtobuf.durationPbMod.Duration = js.native
  def serializeBinaryToWriter(message: typingsSlinky.googleProtobuf.durationPbMod.Duration, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsSlinky.googleProtobuf.durationPbMod.Duration): AsObject = js.native
}

