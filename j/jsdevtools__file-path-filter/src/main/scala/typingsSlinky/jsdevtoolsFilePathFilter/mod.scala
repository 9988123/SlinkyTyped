package typingsSlinky.jsdevtoolsFilePathFilter

import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Filters
import typingsSlinky.jsdevtoolsFilePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/file-path-filter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
  def default(criteria: FilterCriterion*): FilterFunction = js.native
  def default(criteria: AnyFilter): FilterFunction = js.native
  def default(filters: Filters[FilterCriteria]): FilterFunction = js.native
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

