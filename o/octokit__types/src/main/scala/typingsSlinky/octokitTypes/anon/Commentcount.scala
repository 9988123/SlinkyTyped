package typingsSlinky.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commentcount extends js.Object {
  var author: DateEmail = js.native
  var comment_count: Double = js.native
  var committer: DateEmail = js.native
  var message: String = js.native
  var tree: Sha = js.native
  var url: String = js.native
  var verification: Payload = js.native
}

object Commentcount {
  @scala.inline
  def apply(
    author: DateEmail,
    comment_count: Double,
    committer: DateEmail,
    message: String,
    tree: Sha,
    url: String,
    verification: Payload
  ): Commentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentcount]
  }
  @scala.inline
  implicit class CommentcountOps[Self <: Commentcount] (val x: Self) extends AnyVal {
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
    def setAuthor(value: DateEmail): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: DateEmail): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: Sha): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification(value: Payload): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
  
}

