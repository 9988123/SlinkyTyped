package typingsSlinky.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononDialogComponent extends js.Object {
  def on(event: String, callback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): PhononDialogComponent = js.native
}

object PhononDialogComponent {
  @scala.inline
  def apply(on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => PhononDialogComponent): PhononDialogComponent = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[PhononDialogComponent]
  }
  @scala.inline
  implicit class PhononDialogComponentOps[Self <: PhononDialogComponent] (val x: Self) extends AnyVal {
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
    def setOn(value: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => PhononDialogComponent): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}

