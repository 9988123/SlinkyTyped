package typingsSlinky.pulumiAws.opsworksMod

import typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayerArgs
import typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayerState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
class StaticWebLayer protected ()
  extends typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer {
  /**
    * Create a StaticWebLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StaticWebLayerArgs) = this()
  def this(name: String, args: StaticWebLayerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
object StaticWebLayer extends js.Object {
  /**
    * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  def get(name: String, id: Input[ID], state: StaticWebLayerState): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  def get(name: String, id: Input[ID], state: StaticWebLayerState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticWebLayerMod.StaticWebLayer = js.native
  /**
    * Returns true if the given object is an instance of StaticWebLayer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/staticWebLayer.StaticWebLayer */ Boolean = js.native
}

