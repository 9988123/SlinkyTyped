package typingsSlinky.glReactNative.mod

import org.scalajs.dom.raw.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.glReactNative.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate, onContextFailure */ @js.native
trait SurfaceProps
  extends typingsSlinky.glReact.mod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.native
  var onContextFailure: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.native
}

object SurfaceProps {
  @scala.inline
  def apply(): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceProps]
  }
  @scala.inline
  implicit class SurfacePropsOps[Self <: SurfaceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Unit): Self = this.set("onContextCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextCreate: Self = this.set("onContextCreate", js.undefined)
    @scala.inline
    def setOnContextFailure(value: /* e */ js.Error => Unit): Self = this.set("onContextFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextFailure: Self = this.set("onContextFailure", js.undefined)
  }
  
}

