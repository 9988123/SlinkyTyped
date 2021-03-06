package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedRaxHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */] extends DOMElement[P, T]

object DetailedRaxHTMLElement {
  @scala.inline
  def apply[/* <: typingsSlinky.rax.mod.HTMLAttributes[T] */ P, /* <: typingsSlinky.rax.mod.HTMLElement */ T](props: P, `type`: String): DetailedRaxHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedRaxHTMLElement[P, T]]
  }
}

