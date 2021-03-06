package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxScrollView extends dxScrollable {
  /** @name dxScrollView.refresh() */
  def refresh(): Unit = js.native
  /** @name dxScrollView.release(preventScrollBottom) */
  def release(preventScrollBottom: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

