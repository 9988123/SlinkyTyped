package typingsSlinky.mockRequire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Stub = js.Object | typingsSlinky.mockRequire.mod.StubFunction
  type StubFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
