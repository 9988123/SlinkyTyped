package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.anon.PartialScrollSpyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ScrollSpyOptions> * / any */ @JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy () extends js.Object

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typingsSlinky.materializeCss.M.ScrollSpy] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialScrollSpyOptions
  ): js.Array[typingsSlinky.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typingsSlinky.materializeCss.M.ScrollSpy = js.native
  def init(els: Element, options: PartialScrollSpyOptions): typingsSlinky.materializeCss.M.ScrollSpy = js.native
}

