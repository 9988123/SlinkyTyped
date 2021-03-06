package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersOrgsListMembersEndpoint extends js.Object {
  var parameters: OrgsListMembersEndpoint = js.native
  var response: OctokitResponse[OrgsListMembersResponseData] = js.native
}

object ParametersOrgsListMembersEndpoint {
  @scala.inline
  def apply(parameters: OrgsListMembersEndpoint, response: OctokitResponse[OrgsListMembersResponseData]): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
  @scala.inline
  implicit class ParametersOrgsListMembersEndpointOps[Self <: ParametersOrgsListMembersEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: OrgsListMembersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

