package typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar

import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for status bar items.
  */
trait IItem extends js.Object {
  /**
    * A signal that is fired when the item active state changes.
    */
  var activeStateChanged: js.UndefOr[ISignal[_, Unit]] = js.undefined
  /**
    * Which side to place item.
    * Permanent items are intended for the right and left side,
    * with more transient items in the middle.
    */
  var align: js.UndefOr[Alignment] = js.undefined
  /**
    * Whether the item is shown or hidden.
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The item to add to the status bar.
    */
  var item: Widget
  /**
    *  Ordering of Items -- higher rank items are closer to the middle.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    item: Widget,
    activeStateChanged: ISignal[_, Unit] = null,
    align: Alignment = null,
    isActive: () => Boolean = null,
    rank: js.UndefOr[Double] = js.undefined
  ): IItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (activeStateChanged != null) __obj.updateDynamic("activeStateChanged")(activeStateChanged.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (isActive != null) __obj.updateDynamic("isActive")(js.Any.fromFunction0(isActive))
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}

