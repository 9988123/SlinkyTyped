package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.priorityClassListMod.PriorityClassListArgs
import typingsSlinky.pulumiKubernetes.priorityClassMod.PriorityClassArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/scheduling/v1alpha1", JSImport.Namespace)
@js.native
object schedulingV1alpha1Mod extends js.Object {
  @js.native
  class PriorityClass protected ()
    extends typingsSlinky.pulumiKubernetes.priorityClassMod.PriorityClass {
    /**
      * Create a PriorityClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityClassArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PriorityClassList protected ()
    extends typingsSlinky.pulumiKubernetes.priorityClassListMod.PriorityClassList {
    /**
      * Create a PriorityClassList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: PriorityClassListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: PriorityClassListArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object PriorityClass extends js.Object {
    /**
      * Get an existing PriorityClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityClassMod.PriorityClass = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityClassMod.PriorityClass = js.native
    /**
      * Returns true if the given object is an instance of PriorityClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClass.PriorityClass */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PriorityClassList extends js.Object {
    /**
      * Get an existing PriorityClassList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.priorityClassListMod.PriorityClassList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.priorityClassListMod.PriorityClassList = js.native
    /**
      * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/priorityClassList.PriorityClassList */ Boolean = js.native
  }
  
}

