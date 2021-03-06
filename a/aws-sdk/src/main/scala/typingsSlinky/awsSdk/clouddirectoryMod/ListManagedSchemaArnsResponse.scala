package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListManagedSchemaArnsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The ARNs for all AWS managed schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.native
}

object ListManagedSchemaArnsResponse {
  @scala.inline
  def apply(): ListManagedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedSchemaArnsResponse]
  }
  @scala.inline
  implicit class ListManagedSchemaArnsResponseOps[Self <: ListManagedSchemaArnsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSchemaArnsVarargs(value: Arn*): Self = this.set("SchemaArns", js.Array(value :_*))
    @scala.inline
    def setSchemaArns(value: Arns): Self = this.set("SchemaArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaArns: Self = this.set("SchemaArns", js.undefined)
  }
  
}

