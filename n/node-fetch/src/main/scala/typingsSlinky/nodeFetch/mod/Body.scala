package typingsSlinky.nodeFetch.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.nodeFetch.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-fetch", "Body")
@js.native
class Body () extends js.Object {
  def this(body: js.Any) = this()
  def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
  def this(body: js.Any, opts: Size) = this()
  var body: ReadableStream = js.native
  var bodyUsed: Boolean = js.native
  var size: Double = js.native
  var timeout: Double = js.native
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def buffer(): js.Promise[Buffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
  def textConverted(): js.Promise[String] = js.native
}

