package typingsSlinky.workboxRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routeMatchCallbackMod {
  type RouteMatchCallback[R] = js.Function1[
    /* options */ typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions, 
    R
  ]
}
