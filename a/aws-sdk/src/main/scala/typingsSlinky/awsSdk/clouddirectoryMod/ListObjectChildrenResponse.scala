package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectChildrenResponse extends js.Object {
  /**
    * Children structure, which is a map with key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListObjectChildrenResponse {
  @scala.inline
  def apply(): ListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectChildrenResponse]
  }
  @scala.inline
  implicit class ListObjectChildrenResponseOps[Self <: ListObjectChildrenResponse] (val x: Self) extends AnyVal {
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
    def setChildren(value: LinkNameToObjectIdentifierMap): Self = this.set("Children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("Children", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

