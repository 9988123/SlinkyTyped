package typingsSlinky.bitcoinjsLib

import typingsSlinky.bitcoinjsLib.paymentsMod.Stack
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/witnesspubkeyhash/input", JSImport.Namespace)
@js.native
object witnesspubkeyhashInputMod extends js.Object {
  @js.native
  object check extends js.Object {
    var toJSON: js.Function0[String] = js.native
    def apply(script: Stack): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
  }
  
}

