package typingsSlinky.keya

import typingsSlinky.keya.sqliteMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/node/main", JSImport.Namespace)
@js.native
object nodeMainMod extends js.Object {
  val stores: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SQLiteStore.stores */ js.Any = js.native
  def store[T](name: String): js.Promise[default[T]] = js.native
}

