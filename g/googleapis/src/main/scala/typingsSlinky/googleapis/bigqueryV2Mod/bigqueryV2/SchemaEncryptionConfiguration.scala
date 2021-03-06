package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEncryptionConfiguration extends js.Object {
  /**
    * [Optional] Describes the Cloud KMS encryption key that will be used to
    * protect destination BigQuery table. The BigQuery Service Account
    * associated with your project requires access to this encryption key.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
}

object SchemaEncryptionConfiguration {
  @scala.inline
  def apply(): SchemaEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncryptionConfiguration]
  }
  @scala.inline
  implicit class SchemaEncryptionConfigurationOps[Self <: SchemaEncryptionConfiguration] (val x: Self) extends AnyVal {
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
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
  }
  
}

