package typingsSlinky.ejWebAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstAlignment extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstAlignment")
@js.native
object SunburstAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Far extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Near extends SunburstAlignment
  
}

