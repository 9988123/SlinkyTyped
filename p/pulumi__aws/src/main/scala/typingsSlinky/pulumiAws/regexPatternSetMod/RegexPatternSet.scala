package typingsSlinky.pulumiAws.regexPatternSetMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet")
@js.native
class RegexPatternSet protected () extends CustomResource {
  /**
    * Create a RegexPatternSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: RegexPatternSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The name or description of the Regex Pattern Set.
    */
  val name: Output_[String] = js.native
  /**
    * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
    */
  val regexPatternStrings: Output_[js.UndefOr[js.Array[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/regexPatternSet", "RegexPatternSet")
@js.native
object RegexPatternSet extends js.Object {
  /**
    * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): RegexPatternSet = js.native
  /**
    * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
}

