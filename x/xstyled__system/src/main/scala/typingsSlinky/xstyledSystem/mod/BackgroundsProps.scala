package typingsSlinky.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundsProps
  extends BackgroundProps
     with BackgroundColorProps[StyledSystemLength]
     with BackgroundImageProps
     with BackgroundSizeProps[StyledSystemLength]
     with BackgroundPositionProps[StyledSystemLength]
     with BackgroundRepeatProps

object BackgroundsProps {
  @scala.inline
  def apply(): BackgroundsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundsProps]
  }
}

