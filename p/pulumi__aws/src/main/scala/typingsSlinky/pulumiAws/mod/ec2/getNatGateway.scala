package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getNatGatewayMod.GetNatGatewayArgs
import typingsSlinky.pulumiAws.getNatGatewayMod.GetNatGatewayResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getNatGateway")
@js.native
object getNatGateway extends js.Object {
  def apply(): js.Promise[GetNatGatewayResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNatGatewayResult] = js.native
  def apply(args: GetNatGatewayArgs): js.Promise[GetNatGatewayResult] = js.native
  def apply(args: GetNatGatewayArgs, opts: InvokeOptions): js.Promise[GetNatGatewayResult] = js.native
}

