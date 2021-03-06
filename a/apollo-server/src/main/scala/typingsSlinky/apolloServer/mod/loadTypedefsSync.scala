package typingsSlinky.apolloServer.mod

import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.LoadTypedefsOptions
import typingsSlinky.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "loadTypedefsSync")
@js.native
object loadTypedefsSync extends js.Object {
  def apply[AdditionalConfig](
    pointerOrPointers: js.Array[UnnormalizedTypeDefPointer],
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
  def apply[AdditionalConfig](
    pointerOrPointers: UnnormalizedTypeDefPointer,
    options: LoadTypedefsOptions[Partial[AdditionalConfig]]
  ): js.Array[Source] = js.native
}

