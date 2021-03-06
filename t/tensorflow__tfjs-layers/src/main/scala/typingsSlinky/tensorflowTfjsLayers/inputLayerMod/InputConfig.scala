package typingsSlinky.tensorflowTfjsLayers.inputLayerMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfig extends js.Object {
  /**
    * A shape tuple (integer), including the batch size. For instance,
    * `batchShape=[10, 32]` indicates that the expected input will be batches of
    * 10 32-dimensional vectors. `batchShape=[null, 32]` indicates batches of an
    * arbitrary number of 32-dimensional vectors.
    */
  var batchShape: js.UndefOr[Shape] = js.native
  var dtype: js.UndefOr[DataType] = js.native
  /**
    * An optional name string for the layer. Should be unique in a model (do not
    * reuse the same name twice). It will be autogenerated if it isn't provided.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A shape, not including the batch size. For instance, `shape=[32]`
    * indicates that the expected input will be batches of 32-dimensional
    * vectors.
    */
  var shape: js.UndefOr[Shape] = js.native
  /**
    * A boolean specifying whether the placeholder to be created is sparse.
    */
  var sparse: js.UndefOr[Boolean] = js.native
}

object InputConfig {
  @scala.inline
  def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  @scala.inline
  implicit class InputConfigOps[Self <: InputConfig] (val x: Self) extends AnyVal {
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
    def setBatchShapeVarargs(value: (Null | Double)*): Self = this.set("batchShape", js.Array(value :_*))
    @scala.inline
    def setBatchShape(value: Shape): Self = this.set("batchShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchShape: Self = this.set("batchShape", js.undefined)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShapeVarargs(value: (Null | Double)*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
  }
  
}

