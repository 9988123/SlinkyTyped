package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Descriptors extends js.Object {
  var closingRouteKeys: js.Array[String] = js.native
  var descriptors: StackDescriptorMap = js.native
  var openingRouteKeys: js.Array[String] = js.native
  var previousDescriptors: StackDescriptorMap = js.native
  var previousRoutes: js.Array[NavigationRoute[NavigationParams]] = js.native
  var replacingRouteKeys: js.Array[String] = js.native
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}

object Descriptors {
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    openingRouteKeys: js.Array[String],
    previousDescriptors: StackDescriptorMap,
    previousRoutes: js.Array[NavigationRoute[NavigationParams]],
    replacingRouteKeys: js.Array[String],
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): Descriptors = {
    val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], previousDescriptors = previousDescriptors.asInstanceOf[js.Any], previousRoutes = previousRoutes.asInstanceOf[js.Any], replacingRouteKeys = replacingRouteKeys.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors]
  }
  @scala.inline
  implicit class DescriptorsOps[Self <: Descriptors] (val x: Self) extends AnyVal {
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
    def setClosingRouteKeysVarargs(value: String*): Self = this.set("closingRouteKeys", js.Array(value :_*))
    @scala.inline
    def setClosingRouteKeys(value: js.Array[String]): Self = this.set("closingRouteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptors(value: StackDescriptorMap): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpeningRouteKeysVarargs(value: String*): Self = this.set("openingRouteKeys", js.Array(value :_*))
    @scala.inline
    def setOpeningRouteKeys(value: js.Array[String]): Self = this.set("openingRouteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousDescriptors(value: StackDescriptorMap): Self = this.set("previousDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("previousRoutes", js.Array(value :_*))
    @scala.inline
    def setPreviousRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("previousRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacingRouteKeysVarargs(value: String*): Self = this.set("replacingRouteKeys", js.Array(value :_*))
    @scala.inline
    def setReplacingRouteKeys(value: js.Array[String]): Self = this.set("replacingRouteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = this.set("routes", value.asInstanceOf[js.Any])
  }
  
}

