package typingsSlinky.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Err extends js.Object {
  var err: js.Array[js.Error] | Null = js.native
  var keys: js.Array[typingsSlinky.openpgp.mod.key.Key] = js.native
}

object Err {
  @scala.inline
  def apply(keys: js.Array[typingsSlinky.openpgp.mod.key.Key]): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  @scala.inline
  implicit class ErrOps[Self <: Err] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeysVarargs(value: typingsSlinky.openpgp.mod.key.Key*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[typingsSlinky.openpgp.mod.key.Key]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrVarargs(value: js.Error*): Self = this.set("err", js.Array(value :_*))
    @scala.inline
    def setErr(value: js.Array[js.Error]): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrNull: Self = this.set("err", null)
  }
  
}

