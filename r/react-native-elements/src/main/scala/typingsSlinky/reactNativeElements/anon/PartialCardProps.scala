package typingsSlinky.reactNativeElements.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.CardProps> */
@js.native
trait PartialCardProps extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dividerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var featuredSubtitle: js.UndefOr[String] = js.native
  var featuredSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var featuredTitle: js.UndefOr[String] = js.native
  var featuredTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var image: js.UndefOr[ImageSourcePropType] = js.native
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  var imageStyle: js.UndefOr[ImageStyle] = js.native
  var imageWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var title: js.UndefOr[String | ReactElement] = js.native
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PartialCardProps {
  @scala.inline
  def apply(): PartialCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardProps]
  }
  @scala.inline
  implicit class PartialCardPropsOps[Self <: PartialCardProps] (val x: Self) extends AnyVal {
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
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDividerStyle(value: StyleProp[ViewStyle]): Self = this.set("dividerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerStyle: Self = this.set("dividerStyle", js.undefined)
    @scala.inline
    def setDividerStyleNull: Self = this.set("dividerStyle", null)
    @scala.inline
    def setFeaturedSubtitle(value: String): Self = this.set("featuredSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitle: Self = this.set("featuredSubtitle", js.undefined)
    @scala.inline
    def setFeaturedSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("featuredSubtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedSubtitleStyle: Self = this.set("featuredSubtitleStyle", js.undefined)
    @scala.inline
    def setFeaturedSubtitleStyleNull: Self = this.set("featuredSubtitleStyle", null)
    @scala.inline
    def setFeaturedTitle(value: String): Self = this.set("featuredTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitle: Self = this.set("featuredTitle", js.undefined)
    @scala.inline
    def setFeaturedTitleStyle(value: StyleProp[TextStyle]): Self = this.set("featuredTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeaturedTitleStyle: Self = this.set("featuredTitleStyle", js.undefined)
    @scala.inline
    def setFeaturedTitleStyleNull: Self = this.set("featuredTitleStyle", null)
    @scala.inline
    def setImageVarargs(value: ImageURISource*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: ImageSourcePropType): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    @scala.inline
    def setImageStyle(value: ImageStyle): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    @scala.inline
    def setImageWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("imageWrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageWrapperStyle: Self = this.set("imageWrapperStyle", js.undefined)
    @scala.inline
    def setImageWrapperStyleNull: Self = this.set("imageWrapperStyle", null)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    @scala.inline
    def setWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
    @scala.inline
    def setWrapperStyleNull: Self = this.set("wrapperStyle", null)
  }
  
}

