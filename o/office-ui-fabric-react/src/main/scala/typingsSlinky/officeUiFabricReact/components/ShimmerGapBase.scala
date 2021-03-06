package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShimmerGapBase {
  @JSImport("office-ui-fabric-react", "ShimmerGapBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IShimmerGapProps): SharedBuilder_IShimmerGapProps_1862428348 = new SharedBuilder_IShimmerGapProps_1862428348(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ShimmerGapBase.type): SharedBuilder_IShimmerGapProps_1862428348 = new SharedBuilder_IShimmerGapProps_1862428348(js.Array(this.component, js.Dictionary.empty))()
}

