package typingsSlinky.pulumiKubernetes.mod.extensions.v1beta1

import typingsSlinky.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentListArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList")
@js.native
class DeploymentList protected ()
  extends typingsSlinky.pulumiKubernetes.extensionsMod.v1beta1.DeploymentList {
  /**
    * Create a DeploymentList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DeploymentListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: DeploymentListArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList")
@js.native
object DeploymentList extends js.Object {
  /**
    * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentList = js.native
  /**
    * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/deploymentList.DeploymentList */ Boolean = js.native
}

