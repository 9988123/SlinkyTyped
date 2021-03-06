package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionPropertiesBase[T] extends js.Object {
  var items: js.UndefOr[js.Array[T]] = js.native
}

object CollectionPropertiesBase {
  @scala.inline
  def apply[T](): CollectionPropertiesBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesBase[T]]
  }
  @scala.inline
  implicit class CollectionPropertiesBaseOps[Self <: CollectionPropertiesBase[_], T] (val x: Self with CollectionPropertiesBase[T]) extends AnyVal {
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
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

