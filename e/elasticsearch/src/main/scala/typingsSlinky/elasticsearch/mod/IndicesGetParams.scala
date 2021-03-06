package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesGetParams extends GenericParams {
  var allowNoIndices: js.UndefOr[Boolean] = js.native
  var expandWildcards: js.UndefOr[ExpandWildcards] = js.native
  var feature: js.UndefOr[NameList] = js.native
  var flatSettings: js.UndefOr[Boolean] = js.native
  var human: js.UndefOr[Boolean] = js.native
  var ignoreUnavailable: js.UndefOr[Boolean] = js.native
  var includeDefaults: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[NameList] = js.native
  var local: js.UndefOr[Boolean] = js.native
}

object IndicesGetParams {
  @scala.inline
  def apply(): IndicesGetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetParams]
  }
  @scala.inline
  implicit class IndicesGetParamsOps[Self <: IndicesGetParams] (val x: Self) extends AnyVal {
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
    def setAllowNoIndices(value: Boolean): Self = this.set("allowNoIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNoIndices: Self = this.set("allowNoIndices", js.undefined)
    @scala.inline
    def setExpandWildcards(value: ExpandWildcards): Self = this.set("expandWildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandWildcards: Self = this.set("expandWildcards", js.undefined)
    @scala.inline
    def setFeatureVarargs(value: String*): Self = this.set("feature", js.Array(value :_*))
    @scala.inline
    def setFeature(value: NameList): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    @scala.inline
    def setFlatSettings(value: Boolean): Self = this.set("flatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatSettings: Self = this.set("flatSettings", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    @scala.inline
    def setIgnoreUnavailable(value: Boolean): Self = this.set("ignoreUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnavailable: Self = this.set("ignoreUnavailable", js.undefined)
    @scala.inline
    def setIncludeDefaults(value: Boolean): Self = this.set("includeDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDefaults: Self = this.set("includeDefaults", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
  }
  
}

