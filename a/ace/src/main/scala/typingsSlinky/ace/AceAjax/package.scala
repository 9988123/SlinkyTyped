package typingsSlinky.ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AceAjax {
  type CompletionCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* results */ js.Array[typingsSlinky.ace.AceAjax.Completion], 
    scala.Unit
  ]
}
