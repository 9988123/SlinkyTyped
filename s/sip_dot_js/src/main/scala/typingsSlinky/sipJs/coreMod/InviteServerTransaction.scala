package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.coreTransportMod.Transport
import typingsSlinky.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "InviteServerTransaction")
@js.native
class InviteServerTransaction protected ()
  extends typingsSlinky.sipJs.transactionsMod.InviteServerTransaction {
  /**
    * Constructor.
    * Upon construction, a "100 Trying" reply will be immediately sent.
    * After construction the transaction will be in the "proceeding" state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    * @param request - Incoming INVITE request from the transport.
    * @param transport - The transport.
    * @param user - The transaction user.
    */
  def this(
    request: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser
  ) = this()
}

