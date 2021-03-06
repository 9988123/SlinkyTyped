package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getVpcMod.GetVpcArgs
import typingsSlinky.pulumiAws.getVpcMod.GetVpcResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getVpc")
@js.native
object getVpc extends js.Object {
  def apply(): js.Promise[GetVpcResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcResult] = js.native
  def apply(args: GetVpcArgs): js.Promise[GetVpcResult] = js.native
  def apply(args: GetVpcArgs, opts: InvokeOptions): js.Promise[GetVpcResult] = js.native
}

