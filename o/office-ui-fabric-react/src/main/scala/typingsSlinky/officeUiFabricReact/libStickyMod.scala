package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Sticky", JSImport.Namespace)
@js.native
object libStickyMod extends js.Object {
  @js.native
  class Sticky protected ()
    extends typingsSlinky.officeUiFabricReact.stickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  
  /* static members */
  @js.native
  object Sticky extends js.Object {
    var contextType: Context[IScrollablePaneContext] = js.native
    var defaultProps: IStickyProps = js.native
  }
  
  @js.native
  object StickyPositionType extends js.Object {
    /* 0 */ val Both: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Both with Double = js.native
    /* 2 */ val Footer: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Footer with Double = js.native
    /* 1 */ val Header: typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType.Header with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType with Double] = js.native
  }
  
}

