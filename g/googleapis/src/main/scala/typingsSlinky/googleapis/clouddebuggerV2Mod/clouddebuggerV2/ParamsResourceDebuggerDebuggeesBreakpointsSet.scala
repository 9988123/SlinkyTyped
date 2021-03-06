package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDebuggerDebuggeesBreakpointsSet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * ID of the debuggee where the breakpoint is to be set.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBreakpoint] = js.native
}

object ParamsResourceDebuggerDebuggeesBreakpointsSet {
  @scala.inline
  def apply(): ParamsResourceDebuggerDebuggeesBreakpointsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesBreakpointsSet]
  }
  @scala.inline
  implicit class ParamsResourceDebuggerDebuggeesBreakpointsSetOps[Self <: ParamsResourceDebuggerDebuggeesBreakpointsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    @scala.inline
    def setDebuggeeId(value: String): Self = this.set("debuggeeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggeeId: Self = this.set("debuggeeId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaBreakpoint): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

