package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "rfft")
@js.native
object rfft
  extends TopLevel[
      js.Function2[
        /* input */ Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
        /* fftLength */ js.UndefOr[Double], 
        Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]

