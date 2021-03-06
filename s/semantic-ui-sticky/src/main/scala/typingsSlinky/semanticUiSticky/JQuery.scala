package typingsSlinky.semanticUiSticky

import typingsSlinky.semanticUiSticky.SemanticUI.Sticky
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsSlinky.semanticUiSticky.SemanticUI.StickySettings
import typingsSlinky.semanticUiSticky.semanticUiStickyBooleans.`false`
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.bottomOffset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.className
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.context
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.debug
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.destroy
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.error
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.jitter
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.name
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.namespace
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.observeChanges
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.offset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onBottom
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onReposition
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onScroll
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onStick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onTop
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onUnstick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.performance
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.pushing
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.refresh
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.scrollContext
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setSize
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setting
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.silent
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("sticky")
  var sticky_Original: Sticky = js.native
  def sticky(): JQuery = js.native
  def sticky(behavior: setting, name: bottomOffset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def sticky(behavior: setting, name: bottomOffset, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def sticky(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def sticky(behavior: setting, name: context, value: String): JQuery = js.native
  def sticky(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def sticky(behavior: setting, name: context, value: `false`): JQuery = js.native
  def sticky(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def sticky(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
  def sticky(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def sticky(behavior: setting, name: namespace, value: String): JQuery = js.native
  def sticky(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def sticky(behavior: setting, name: name, value: String): JQuery = js.native
  def sticky(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def sticky(behavior: setting, name: offset, value: Double): JQuery = js.native
  def sticky(behavior: setting, name: onBottom, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onBottom, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onReposition, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onReposition, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onScroll, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onScroll, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onStick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onStick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onTop, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onTop, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: onUnstick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def sticky(behavior: setting, name: onUnstick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def sticky(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: pushing, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: pushing, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def sticky(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def sticky(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def sticky(behavior: setting, name: setSize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: setSize, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def sticky(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def sticky(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def sticky(settings: StickySettings): JQuery = js.native
  @JSName("sticky")
  def sticky_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("sticky")
  def sticky_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("sticky")
  def sticky_destroy(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: refresh): JQuery = js.native
  @JSName("sticky")
  def sticky_setting(behavior: setting, value: StickySettings): JQuery = js.native
}

