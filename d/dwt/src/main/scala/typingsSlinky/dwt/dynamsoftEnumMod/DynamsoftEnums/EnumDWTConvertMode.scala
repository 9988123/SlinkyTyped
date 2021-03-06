package typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTConvertMode extends js.Object

@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ConvertMode")
@js.native
object EnumDWTConvertMode extends js.Object {
  @js.native
  sealed trait CM_DEFAULT extends EnumDWTConvertMode
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWTConvertMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTConvertMode with Double] = js.native
  /* 0 */ @js.native
  object CM_DEFAULT extends TopLevel[CM_DEFAULT with Double]
  
  /* 1 */ @js.native
  object CM_RENDERALL extends TopLevel[CM_RENDERALL with Double]
  
}

