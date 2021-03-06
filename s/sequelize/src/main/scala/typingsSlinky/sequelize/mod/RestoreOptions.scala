package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.restore
  */
trait RestoreOptions extends LoggingOptions {
  /**
    * Run before / after bulk restore hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, restore will find all records within the where parameter and will execute before / after
    * bulkRestore hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  /**
    * How many rows to undelete
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * Filter the restore
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object RestoreOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    individualHooks: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    logging: Boolean | js.Function = null,
    transaction: Transaction = null,
    where: AnyWhereOptions = null
  ): RestoreOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreOptions]
  }
}

