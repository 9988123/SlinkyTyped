package typingsSlinky.tcomb.mod

import typingsSlinky.tcomb.anon.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// interface
//
@js.native
trait Interface_[T] extends Type[T] {
  @JSName("meta")
  var meta_Interface_ : Props = js.native
  @JSName("update")
  var update_Original: Update_[T] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin]): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: java.lang.String): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: js.Array[StructMixin], name: StructOptions): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: java.lang.String): Struct_[E] = js.native
  def extend[E /* <: T */](mixins: StructMixin, name: StructOptions): Struct_[E] = js.native
  def update(instance: T, spec: UpdatePatch): T = js.native
}

