package typingsSlinky.algoliaClientSearch.anon

import typingsSlinky.algoliaClientSearch.mod.DeleteApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>> */
@js.native
trait ReadonlyWaitablePromiseDeCatch extends js.Object {
  def `catch`[TResult](): js.Promise[DeleteApiKeyResponse | TResult] = js.native
  def `finally`(): js.Promise[DeleteApiKeyResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}

object ReadonlyWaitablePromiseDeCatch {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteApiKeyResponse | js.Any],
    `finally`: () => js.Promise[DeleteApiKeyResponse],
    `then`: () => js.Promise[js.Any]
  ): ReadonlyWaitablePromiseDeCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeCatch]
  }
  @scala.inline
  implicit class ReadonlyWaitablePromiseDeCatchOps[Self <: ReadonlyWaitablePromiseDeCatch] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[DeleteApiKeyResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[DeleteApiKeyResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

