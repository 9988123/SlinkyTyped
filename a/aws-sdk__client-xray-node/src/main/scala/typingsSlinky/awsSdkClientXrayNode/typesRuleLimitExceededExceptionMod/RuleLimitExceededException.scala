package typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod

import typingsSlinky.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleLimitExceededException
  extends ServiceException[RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException = js.native
}

object RuleLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RuleLimitExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException
  ): RuleLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleLimitExceededException]
  }
  @scala.inline
  implicit class RuleLimitExceededExceptionOps[Self <: RuleLimitExceededException] (val x: Self) extends AnyVal {
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
    def setName(value: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

