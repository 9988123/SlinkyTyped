package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockCommit")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockCommit.
  * @param [properties] Properties to set
  */
class ConsensusNotifyBlockCommit () extends IConsensusNotifyBlockCommit {
  def this(properties: IConsensusNotifyBlockCommit) = this()
  /** ConsensusNotifyBlockCommit blockId. */
  @JSName("blockId")
  var blockId_ConsensusNotifyBlockCommit: js.typedarray.Uint8Array = js.native
  /**
    * Converts this ConsensusNotifyBlockCommit to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockCommit")
@js.native
object ConsensusNotifyBlockCommit extends js.Object {
  /**
    * Creates a new ConsensusNotifyBlockCommit instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockCommit instance
    */
  def create(): ConsensusNotifyBlockCommit = js.native
  def create(properties: IConsensusNotifyBlockCommit): ConsensusNotifyBlockCommit = js.native
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ConsensusNotifyBlockCommit = js.native
  def decode(reader: Reader, length: Double): ConsensusNotifyBlockCommit = js.native
  def decode(reader: js.typedarray.Uint8Array): ConsensusNotifyBlockCommit = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusNotifyBlockCommit = js.native
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ConsensusNotifyBlockCommit = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusNotifyBlockCommit = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusNotifyBlockCommit): Writer = js.native
  def encode(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message, length delimited. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusNotifyBlockCommit): Writer = js.native
  def encodeDelimited(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusNotifyBlockCommit message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockCommit
    */
  def fromObject(`object`: StringDictionary[js.Any]): ConsensusNotifyBlockCommit = js.native
  /**
    * Creates a plain object from a ConsensusNotifyBlockCommit message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockCommit
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ConsensusNotifyBlockCommit): StringDictionary[js.Any] = js.native
  def toObject(message: ConsensusNotifyBlockCommit, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusNotifyBlockCommit message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

