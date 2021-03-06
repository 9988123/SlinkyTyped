package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.create method
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.sequelize.mod.ReturningOptions because Already inherited
- typingsSlinky.sequelize.mod.BuildOptions because var conflicts: returning. Inlined raw, isNewRecord, include */ trait CreateOptions extends InstanceSaveOptions {
  /**
    * an array of include options - Used to build prefetched/included model instances. See `set`
    *
    * TODO: See set
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  /**
    * Is this record new
    */
  var isNewRecord: js.UndefOr[Boolean] = js.undefined
  /**
    * On Duplicate
    */
  var onDuplicate: js.UndefOr[String] = js.undefined
  /**
    * If set to true, values will ignore field and virtual setters.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    hooks: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    isNewRecord: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    onDuplicate: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    returning: js.UndefOr[Boolean] = js.undefined,
    searchPath: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRecord)) __obj.updateDynamic("isNewRecord")(isNewRecord.get.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (onDuplicate != null) __obj.updateDynamic("onDuplicate")(onDuplicate.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.get.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
}

