package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse")
@js.native
/**
  * Constructs a new ClientBatchGetResponse.
  * @param [properties] Properties to set
  */
class ClientBatchGetResponse () extends IClientBatchGetResponse {
  def this(properties: IClientBatchGetResponse) = this()
  /** ClientBatchGetResponse status. */
  @JSName("status")
  var status_ClientBatchGetResponse: Status = js.native
  /**
    * Converts this ClientBatchGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBatchGetResponse")
@js.native
object ClientBatchGetResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ClientBatchGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchGetResponse instance
    */
  def create(): ClientBatchGetResponse = js.native
  def create(properties: IClientBatchGetResponse): ClientBatchGetResponse = js.native
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBatchGetResponse = js.native
  def decode(reader: Reader, length: Double): ClientBatchGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): ClientBatchGetResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBatchGetResponse = js.native
  /**
    * Decodes a ClientBatchGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBatchGetResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBatchGetResponse = js.native
  /**
    * Encodes the specified ClientBatchGetResponse message. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBatchGetResponse): Writer = js.native
  def encode(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBatchGetResponse message, length delimited. Does not implicitly {@link ClientBatchGetResponse.verify|verify} messages.
    * @param message ClientBatchGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBatchGetResponse): Writer = js.native
  def encodeDelimited(message: IClientBatchGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBatchGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBatchGetResponse = js.native
  /**
    * Creates a plain object from a ClientBatchGetResponse message. Also converts values to other types if specified.
    * @param message ClientBatchGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBatchGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBatchGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBatchGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    
    @js.native
    sealed trait INVALID_ID extends Status
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
    
    /* 8 */ @js.native
    object INVALID_ID extends TopLevel[INVALID_ID with Double]
    
    /* 5 */ @js.native
    object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}

