package typingsSlinky.reactSizeme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type WithSizeOnSizeCallback = js.Function1[/* size */ typingsSlinky.reactSizeme.anon.Height, scala.Unit]
}
