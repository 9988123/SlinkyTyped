package typingsSlinky.pulumiKubernetes.extensionsV1beta1Mod

import typingsSlinky.pulumiKubernetes.networkPolicyListMod.NetworkPolicyListArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/extensions/v1beta1", "NetworkPolicyList")
@js.native
class NetworkPolicyList protected ()
  extends typingsSlinky.pulumiKubernetes.networkPolicyListMod.NetworkPolicyList {
  /**
    * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: NetworkPolicyListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/extensions/v1beta1", "NetworkPolicyList")
@js.native
object NetworkPolicyList extends js.Object {
  /**
    * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.networkPolicyListMod.NetworkPolicyList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.networkPolicyListMod.NetworkPolicyList = js.native
  /**
    * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyList.NetworkPolicyList */ Boolean = js.native
}

