package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryScanCallbacks extends js.Object {
  /**
    * Called when there was a memory access error while scanning.
    *
    * @param reason Why the memory access failed.
    */
  var onError: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  /**
    * Called when the memory range has been fully scanned.
    */
  def onComplete(): Unit = js.native
  /**
    * Called with each occurence that was found.
    *
    * @param address Memory address where a match was found.
    * @param size Size of this match.
    */
  def onMatch(address: NativePointer, size: Double): Unit | EnumerateAction = js.native
}

object MemoryScanCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (NativePointer, Double) => Unit | EnumerateAction): MemoryScanCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[MemoryScanCallbacks]
  }
  @scala.inline
  implicit class MemoryScanCallbacksOps[Self <: MemoryScanCallbacks] (val x: Self) extends AnyVal {
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setOnMatch(value: (NativePointer, Double) => Unit | EnumerateAction): Self = this.set("onMatch", js.Any.fromFunction2(value))
    @scala.inline
    def setOnError(value: /* reason */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

