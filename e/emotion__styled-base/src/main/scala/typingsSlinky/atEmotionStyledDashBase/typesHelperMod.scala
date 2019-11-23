package typingsSlinky.atEmotionStyledDashBase

import typingsSlinky.react.reactMod.ComponentPropsWithRef
import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/styled-base/types/helper", JSImport.Namespace)
@js.native
object typesHelperMod extends js.Object {
  type Omit[T, U] = Pick[T, Exclude[String, U]]
  type Overwrapped[T, U] = Pick[T, Extract[String, String]]
  type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]
}

