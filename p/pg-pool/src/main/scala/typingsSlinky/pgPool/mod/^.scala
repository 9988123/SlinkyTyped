package typingsSlinky.pgPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-pool", JSImport.Namespace)
@js.native
class ^[T /* <: typingsSlinky.pg.mod.Client */] () extends Pool[T] {
  def this(config: Config[T]) = this()
  def this(config: js.UndefOr[scala.Nothing], client: ClientLikeCtr[T]) = this()
  def this(config: Config[T], client: ClientLikeCtr[T]) = this()
}

