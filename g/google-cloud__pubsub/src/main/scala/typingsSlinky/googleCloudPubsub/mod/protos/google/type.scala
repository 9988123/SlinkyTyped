package typingsSlinky.googleCloudPubsub.mod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.`type`.IExpr
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Namespace type. */
@JSImport("@google-cloud/pubsub", "protos.google.type")
@js.native
object `type` extends js.Object {
  /** Represents an Expr. */
  @js.native
  /**
    * Constructs a new Expr.
    * @param [properties] Properties to set
    */
  class Expr ()
    extends typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr {
    def this(properties: IExpr) = this()
  }
  
  /* static members */
  @js.native
  object Expr extends js.Object {
    /**
      * Creates a new Expr instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Expr instance
      */
    def create(): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    def create(properties: IExpr): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    /**
      * Decodes an Expr message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    /**
      * Decodes an Expr message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Expr
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    /**
      * Encodes the specified Expr message. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IExpr): Writer = js.native
    def encode(message: IExpr, writer: Writer): Writer = js.native
    /**
      * Encodes the specified Expr message, length delimited. Does not implicitly {@link google.type.Expr.verify|verify} messages.
      * @param message Expr message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IExpr): Writer = js.native
    def encodeDelimited(message: IExpr, writer: Writer): Writer = js.native
    /**
      * Creates an Expr message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Expr
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr = js.native
    /**
      * Creates a plain object from an Expr message. Also converts values to other types if specified.
      * @param message Expr
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr): StringDictionary[js.Any] = js.native
    def toObject(message: typingsSlinky.googleCloudPubsub.protosMod.google.`type`.Expr, options: IConversionOptions): StringDictionary[js.Any] = js.native
    /**
      * Verifies an Expr message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
}

