package typingsSlinky.aphrodite.cssPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperties
  extends CSSPropertiesLossy
     with CSSPropertiesComplete
     with CSSPropertiesPseudo

object CSSProperties {
  @scala.inline
  def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
}

