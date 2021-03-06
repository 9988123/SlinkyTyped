package typingsSlinky.grpcGrpcJs.makeClientMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerMethodDefinition[RequestType, ResponseType] extends js.Object {
  var originalName: js.UndefOr[String] = js.native
  var path: String = js.native
  @JSName("requestDeserialize")
  var requestDeserialize_Original: Deserialize[RequestType] = js.native
  var requestStream: Boolean = js.native
  @JSName("responseSerialize")
  var responseSerialize_Original: Serialize[ResponseType] = js.native
  var responseStream: Boolean = js.native
  def requestDeserialize(bytes: Buffer): RequestType = js.native
  def responseSerialize(value: ResponseType): Buffer = js.native
}

