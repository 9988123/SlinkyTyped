package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.KMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-lambda.aws-lambda/trigger/codepipeline.EncryptionKey & {  type :'KMS'} */
@js.native
trait EncryptionKeytypeKMS extends js.Object {
  var id: String = js.native
  var `type`: String with KMS = js.native
}

object EncryptionKeytypeKMS {
  @scala.inline
  def apply(id: String, `type`: String with KMS): EncryptionKeytypeKMS = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKeytypeKMS]
  }
  @scala.inline
  implicit class EncryptionKeytypeKMSOps[Self <: EncryptionKeytypeKMS] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String with KMS): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

