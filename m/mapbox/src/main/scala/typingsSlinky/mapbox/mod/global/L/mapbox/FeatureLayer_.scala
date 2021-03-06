package typingsSlinky.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureGroup<ILayer> * / any */ @js.native
trait FeatureLayer_ extends js.Object {
  /**
    * Gets the filter function for this data layer.
    */
  def getFilter(): FilterFunction = js.native
  /**
    * Get the contents of this layer as GeoJSON data.
    */
  def getGeoJSON(): js.Any = js.native
  /**
    * Load marker GeoJSON data from a map with the given id on Mapbox.
    */
  def loadID(id: String): js.Any = js.native
  /**
    * Load GeoJSON data for this layer from the URL given by url.
    */
  def loadURL(url: String): js.Any = js.native
  /**
    * Sets the filter function for this data layer.
    */
  def setFilter(filter: FilterFunction): js.Any = js.native
  /**
    * Set the contents of a markers layer: run the provided features through
    * the filter function and then through the factory function to create
    * elements for the map. If the layer already has features, they are
    * replaced with the new features. An empty array will clear the
    * layer of all features.
    */
  def setGeoJSON(geojson: js.Any): FeatureLayer_ = js.native
}

object FeatureLayer_ {
  @scala.inline
  def apply(
    getFilter: () => FilterFunction,
    getGeoJSON: () => js.Any,
    loadID: String => js.Any,
    loadURL: String => js.Any,
    setFilter: FilterFunction => js.Any,
    setGeoJSON: js.Any => FeatureLayer_
  ): FeatureLayer_ = {
    val __obj = js.Dynamic.literal(getFilter = js.Any.fromFunction0(getFilter), getGeoJSON = js.Any.fromFunction0(getGeoJSON), loadID = js.Any.fromFunction1(loadID), loadURL = js.Any.fromFunction1(loadURL), setFilter = js.Any.fromFunction1(setFilter), setGeoJSON = js.Any.fromFunction1(setGeoJSON))
    __obj.asInstanceOf[FeatureLayer_]
  }
  @scala.inline
  implicit class FeatureLayer_Ops[Self <: FeatureLayer_] (val x: Self) extends AnyVal {
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
    def setGetFilter(value: () => FilterFunction): Self = this.set("getFilter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGeoJSON(value: () => js.Any): Self = this.set("getGeoJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadID(value: String => js.Any): Self = this.set("loadID", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadURL(value: String => js.Any): Self = this.set("loadURL", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFilter(value: FilterFunction => js.Any): Self = this.set("setFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGeoJSON(value: js.Any => FeatureLayer_): Self = this.set("setGeoJSON", js.Any.fromFunction1(value))
  }
  
}

