package typingsSlinky.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of StyleSheet. */
@js.native
trait StyleSheetList
  extends /* index */ NumberDictionary[org.scalajs.dom.raw.CSSStyleSheet] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.CSSStyleSheet]] = js.native
  val length: Double = js.native
  def item(index: Double): org.scalajs.dom.raw.CSSStyleSheet | Null = js.native
}

