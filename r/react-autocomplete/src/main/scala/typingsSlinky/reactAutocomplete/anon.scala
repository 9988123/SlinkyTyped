package typingsSlinky.reactAutocomplete

import typingsSlinky.reactAutocomplete.reactAutocompleteStrings.backward
import typingsSlinky.reactAutocomplete.reactAutocompleteStrings.forward
import typingsSlinky.reactAutocomplete.reactAutocompleteStrings.none
import typingsSlinky.std.FocusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(): Unit = js.native
    def apply(options: FocusOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallStartEndDirection extends js.Object {
    def apply(start: Double, end: Double): Unit = js.native
    def apply(start: Double, end: Double, direction: backward): Unit = js.native
    def apply(start: Double, end: Double, direction: forward): Unit = js.native
    def apply(start: Double, end: Double, direction: none): Unit = js.native
  }
  
}

