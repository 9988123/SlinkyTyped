package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.v33Mod.dfareportingV33.SchemaDateRange
import typingsSlinky.googleapis.v33Mod.dfareportingV33.SchemaDimensionValue
import typingsSlinky.googleapis.v33Mod.dfareportingV33.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlapMetricNames extends js.Object {
  var breakdown: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimension: js.UndefOr[String] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  var pivoted: js.UndefOr[Boolean] = js.native
}

object OverlapMetricNames {
  @scala.inline
  def apply(): OverlapMetricNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlapMetricNames]
  }
  @scala.inline
  implicit class OverlapMetricNamesOps[Self <: OverlapMetricNames] (val x: Self) extends AnyVal {
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
    def setBreakdownVarargs(value: SchemaSortedDimension*): Self = this.set("breakdown", js.Array(value :_*))
    @scala.inline
    def setBreakdown(value: js.Array[SchemaSortedDimension]): Self = this.set("breakdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakdown: Self = this.set("breakdown", js.undefined)
    @scala.inline
    def setDateRange(value: SchemaDateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    @scala.inline
    def setDimensionFiltersVarargs(value: SchemaDimensionValue*): Self = this.set("dimensionFilters", js.Array(value :_*))
    @scala.inline
    def setDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = this.set("dimensionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilters: Self = this.set("dimensionFilters", js.undefined)
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
    @scala.inline
    def setOverlapMetricNamesVarargs(value: String*): Self = this.set("overlapMetricNames", js.Array(value :_*))
    @scala.inline
    def setOverlapMetricNames(value: js.Array[String]): Self = this.set("overlapMetricNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlapMetricNames: Self = this.set("overlapMetricNames", js.undefined)
    @scala.inline
    def setPivoted(value: Boolean): Self = this.set("pivoted", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivoted: Self = this.set("pivoted", js.undefined)
  }
  
}

