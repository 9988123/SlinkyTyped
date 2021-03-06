package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.RemoveUserIDResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>> */
@js.native
trait ReadonlyPromiseRemoveUser extends js.Object {
  def `catch`[TResult](): js.Promise[RemoveUserIDResponse | TResult] = js.native
  def `finally`(): js.Promise[RemoveUserIDResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}

object ReadonlyPromiseRemoveUser {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[RemoveUserIDResponse | js.Any],
    `finally`: () => js.Promise[RemoveUserIDResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyPromiseRemoveUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRemoveUser]
  }
  @scala.inline
  implicit class ReadonlyPromiseRemoveUserOps[Self <: ReadonlyPromiseRemoveUser] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[RemoveUserIDResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[RemoveUserIDResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

