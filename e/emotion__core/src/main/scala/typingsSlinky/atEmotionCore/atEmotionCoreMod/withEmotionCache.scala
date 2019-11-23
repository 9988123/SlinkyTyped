package typingsSlinky.atEmotionCore.atEmotionCoreMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/core", "withEmotionCache")
@js.native
object withEmotionCache extends js.Object {
  def apply[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], TagMod[Any]]
  ): ReactComponentClass[Props with ClassAttributes[RefType]] = js.native
}

