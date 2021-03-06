package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates which [regional endpoint]
  * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) failed
  * to respond to a request for data.
  */
@js.native
trait SchemaFailedLocation extends js.Object {
  /**
    * The name of the [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFailedLocation {
  @scala.inline
  def apply(): SchemaFailedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailedLocation]
  }
  @scala.inline
  implicit class SchemaFailedLocationOps[Self <: SchemaFailedLocation] (val x: Self) extends AnyVal {
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
  }
  
}

