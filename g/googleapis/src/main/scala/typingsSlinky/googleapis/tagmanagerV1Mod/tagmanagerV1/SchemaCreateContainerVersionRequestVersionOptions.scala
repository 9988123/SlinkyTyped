package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for new container versions.
  */
@js.native
trait SchemaCreateContainerVersionRequestVersionOptions extends js.Object {
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * The creation of this version may be for quick preview and shouldn&#39;t
    * be saved.
    */
  var quickPreview: js.UndefOr[Boolean] = js.native
}

object SchemaCreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(): SchemaCreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionRequestVersionOptions]
  }
  @scala.inline
  implicit class SchemaCreateContainerVersionRequestVersionOptionsOps[Self <: SchemaCreateContainerVersionRequestVersionOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setQuickPreview(value: Boolean): Self = this.set("quickPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickPreview: Self = this.set("quickPreview", js.undefined)
  }
  
}

