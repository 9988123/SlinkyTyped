package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceArgs
import typingsSlinky.pulumiAws.getNetworkInterfaceMod.GetNetworkInterfaceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getNetworkInterface")
@js.native
object getNetworkInterface extends js.Object {
  def apply(): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: GetNetworkInterfaceArgs): js.Promise[GetNetworkInterfaceResult] = js.native
  def apply(args: GetNetworkInterfaceArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfaceResult] = js.native
}

