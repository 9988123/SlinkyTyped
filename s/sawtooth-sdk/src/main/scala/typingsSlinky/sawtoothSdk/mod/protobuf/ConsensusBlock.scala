package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IConsensusBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.ConsensusBlock")
@js.native
/**
  * Constructs a new ConsensusBlock.
  * @param [properties] Properties to set
  */
class ConsensusBlock ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock {
  def this(properties: IConsensusBlock) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.ConsensusBlock")
@js.native
object ConsensusBlock extends js.Object {
  /**
    * Creates a new ConsensusBlock instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlock instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  def create(properties: IConsensusBlock): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  /**
    * Encodes the specified ConsensusBlock message. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IConsensusBlock): Writer = js.native
  def encode(message: IConsensusBlock, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ConsensusBlock message, length delimited. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IConsensusBlock): Writer = js.native
  def encodeDelimited(message: IConsensusBlock, writer: Writer): Writer = js.native
  /**
    * Creates a ConsensusBlock message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlock
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock = js.native
  /**
    * Creates a plain object from a ConsensusBlock message. Also converts values to other types if specified.
    * @param message ConsensusBlock
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ConsensusBlock, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ConsensusBlock message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

