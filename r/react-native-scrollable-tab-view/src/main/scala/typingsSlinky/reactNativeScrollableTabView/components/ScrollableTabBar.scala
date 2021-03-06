package typingsSlinky.reactNativeScrollableTabView.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeScrollableTabView.anon.TabBarPropsScrollableTabB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollableTabBar {
  @JSImport("react-native-scrollable-tab-view", "ScrollableTabBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeScrollableTabView.mod.ScrollableTabBar] {
    @scala.inline
    def activeTab(value: Double): this.type = set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def activeTextColor(value: String): this.type = set("activeTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def goToPage(value: /* pageNumber */ Double => Unit): this.type = set("goToPage", js.Any.fromFunction1(value))
    @scala.inline
    def inactiveTextColor(value: String): this.type = set("inactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def renderTab(
      value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => ReactElement
    ): this.type = set("renderTab", js.Any.fromFunction5(value))
    @scala.inline
    def scrollOffset(value: Double): this.type = set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollValue(value: Value): this.type = set("scrollValue", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabStyle(value: ViewStyle): this.type = set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def tabsVarargs(value: ReactElement*): this.type = set("tabs", js.Array(value :_*))
    @scala.inline
    def tabs(value: js.Array[ReactElement]): this.type = set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def tabsContainerStyle(value: ViewStyle): this.type = set("tabsContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def textStyle(value: TextStyle): this.type = set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def underlineStyle(value: ViewStyle): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabBarPropsScrollableTabB): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScrollableTabBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

