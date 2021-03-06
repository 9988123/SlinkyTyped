package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.IMessage
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Message instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create(): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  def create(properties: IMessage): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  /**
    * Decodes a Message message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  /**
    * Decodes a Message message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Message
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  /**
    * Encodes the specified Message message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMessage): Writer = js.native
  def encode(message: IMessage, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Message message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.verify|verify} messages.
    * @param message Message message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMessage): Writer = js.native
  def encodeDelimited(message: IMessage, writer: Writer): Writer = js.native
  /**
    * Creates a Message message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message = js.native
  /**
    * Creates a plain object from a Message message. Also converts values to other types if specified.
    * @param message Message
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Message message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

