package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typingsSlinky.sequelize.anon.Exclude
import typingsSlinky.sequelize.mod.FindOptionsAttributesArray
import typingsSlinky.sequelize.mod.IncludeOptions
import typingsSlinky.sequelize.mod.Model
import typingsSlinky.sequelize.mod.WhereOptions
import typingsSlinky.sequelize.mod.and
import typingsSlinky.sequelize.mod.col
import typingsSlinky.sequelize.mod.fn
import typingsSlinky.sequelize.mod.or
import typingsSlinky.sequelize.mod.where
import typingsSlinky.sequelizeCursorPagination.sequelizeCursorPaginationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  var raw: `true`
}

object PaginateRawOptions {
  @scala.inline
  def apply[T](
    raw: `true`,
    after: String = null,
    attributes: FindOptionsAttributesArray | Exclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: js.UndefOr[Double] = js.undefined,
    paginationField: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
}

