package typingsSlinky.googleCloudPubsub.mod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IEnumDescriptorProto
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EnumDescriptorProto. */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto ()
  extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "protos.google.protobuf.EnumDescriptorProto")
@js.native
object EnumDescriptorProto extends js.Object {
  /** Represents an EnumReservedRange. */
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  class EnumReservedRange ()
    extends typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange {
    def this(properties: IEnumReservedRange) = this()
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  def create(properties: IEnumDescriptorProto): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumDescriptorProto): Writer = js.native
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumDescriptorProto): Writer = js.native
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /* static members */
  @js.native
  object EnumReservedRange extends js.Object {
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    def create(): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    def create(properties: IEnumReservedRange): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IEnumReservedRange): Writer = js.native
    def encode(message: IEnumReservedRange, writer: Writer): Writer = js.native
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IEnumReservedRange): Writer = js.native
    def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = js.native
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

