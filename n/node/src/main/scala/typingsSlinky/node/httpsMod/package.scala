package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  type ServerOptions = typingsSlinky.node.tlsMod.SecureContextOptions with typingsSlinky.node.tlsMod.TlsOptions with typingsSlinky.node.httpMod.ServerOptions
}
