package typingsSlinky.bitcoinjsLib

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/witnesspubkeyhash/output", JSImport.Namespace)
@js.native
object witnesspubkeyhashOutputMod extends js.Object {
  @js.native
  object check extends js.Object {
    var toJSON: js.Function0[String] = js.native
    def apply(script: js.Array[Double | Buffer]): Boolean = js.native
    def apply(script: Buffer): Boolean = js.native
  }
  
}

