package typingsSlinky.pulumiAws.mod.apigateway

import typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainNameArgs
import typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainNameState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.DomainName")
@js.native
class DomainName protected ()
  extends typingsSlinky.pulumiAws.apigatewayMod.DomainName {
  /**
    * Create a DomainName resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainNameArgs) = this()
  def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.DomainName")
@js.native
object DomainName extends js.Object {
  /**
    * Get an existing DomainName resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState): typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayDomainNameMod.DomainName = js.native
  /**
    * Returns true if the given object is an instance of DomainName.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
}

