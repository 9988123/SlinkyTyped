package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.internetGatewayMod.InternetGatewayArgs
import typingsSlinky.pulumiAws.internetGatewayMod.InternetGatewayState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "InternetGateway")
@js.native
class InternetGateway protected ()
  extends typingsSlinky.pulumiAws.internetGatewayMod.InternetGateway {
  /**
    * Create a InternetGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: InternetGatewayArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: InternetGatewayArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "InternetGateway")
@js.native
object InternetGateway extends js.Object {
  /**
    * Get an existing InternetGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.internetGatewayMod.InternetGateway = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.internetGatewayMod.InternetGateway = js.native
  def get(name: String, id: Input[ID], state: InternetGatewayState): typingsSlinky.pulumiAws.internetGatewayMod.InternetGateway = js.native
  def get(name: String, id: Input[ID], state: InternetGatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.internetGatewayMod.InternetGateway = js.native
  /**
    * Returns true if the given object is an instance of InternetGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/internetGateway.InternetGateway */ Boolean = js.native
}

