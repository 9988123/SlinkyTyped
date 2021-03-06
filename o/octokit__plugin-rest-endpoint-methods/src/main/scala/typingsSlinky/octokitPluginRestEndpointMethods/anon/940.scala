package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCodeFrequencyStatsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `940` extends js.Object {
  var parameters: RequestParameters with (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType]) = js.native
  var response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData] = js.native
}

object `940` {
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]
  ): `940` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`940`]
  }
  @scala.inline
  implicit class `940Ops`[Self <: `940`] (val x: Self) extends AnyVal {
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
    def setParameters(
      value: RequestParameters with (Omit[ReposGetCodeFrequencyStatsEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCodeFrequencyStatsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

