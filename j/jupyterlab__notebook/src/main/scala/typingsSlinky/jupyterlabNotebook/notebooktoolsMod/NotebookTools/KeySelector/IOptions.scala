package typingsSlinky.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabCells.mod.Cell
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a keyselector.
  */
trait IOptions extends js.Object {
  /**
    * Default value for default setters and getters if value is not found.
    */
  var default: js.UndefOr[JSONValue] = js.undefined
  /**
    * An optional value getter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @returns The appropriate value for the selector.
    */
  var getter: js.UndefOr[js.Function1[/* cell */ Cell, JSONValue]] = js.undefined
  /**
    * The metadata key of interest.
    */
  var key: String
  /**
    * The map of options to values.
    *
    * #### Notes
    * If a value equals the default, choosing it may erase the key from the
    * metadata.
    */
  var optionsMap: StringDictionary[JSONValue]
  /**
    * An optional value setter for the selector.
    *
    * @param cell - The currently active cell.
    *
    * @param value - The value of the selector.
    *
    * #### Notes
    * The setter should set the appropriate metadata value given the value of
    * the selector.
    */
  var setter: js.UndefOr[js.Function2[/* cell */ Cell, /* value */ JSONValue, Unit]] = js.undefined
  /**
    * The optional title of the selector - defaults to capitalized `key`.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The optional valid cell types - defaults to all valid types.
    */
  var validCellTypes: js.UndefOr[js.Array[CellType]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    key: String,
    optionsMap: StringDictionary[JSONValue],
    default: js.UndefOr[Null | JSONValue] = js.undefined,
    getter: /* cell */ Cell => JSONValue = null,
    setter: (/* cell */ Cell, /* value */ JSONValue) => Unit = null,
    title: String = null,
    validCellTypes: js.Array[CellType] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optionsMap = optionsMap.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (getter != null) __obj.updateDynamic("getter")(js.Any.fromFunction1(getter))
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2(setter))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (validCellTypes != null) __obj.updateDynamic("validCellTypes")(validCellTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

