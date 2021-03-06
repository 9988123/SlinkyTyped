package typingsSlinky.rsocketFlowable.flowableMapOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any */ @js.native
trait FlowableMapOperator[T, R] extends js.Object {
  def onComplete(): Unit = js.native
  def onError(error: js.Error): Unit = js.native
  def onNext(t: T): Unit = js.native
  def onSubscribe(
    subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): Unit = js.native
}

object FlowableMapOperator {
  @scala.inline
  def apply[T, R](
    onComplete: () => Unit,
    onError: js.Error => Unit,
    onNext: T => Unit,
    onSubscribe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
  ): FlowableMapOperator[T, R] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), onSubscribe = js.Any.fromFunction1(onSubscribe))
    __obj.asInstanceOf[FlowableMapOperator[T, R]]
  }
  @scala.inline
  implicit class FlowableMapOperatorOps[Self <: FlowableMapOperator[_, _], T, R] (val x: Self with (FlowableMapOperator[T, R])) extends AnyVal {
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: js.Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNext(value: T => Unit): Self = this.set("onNext", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSubscribe(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any => Unit
    ): Self = this.set("onSubscribe", js.Any.fromFunction1(value))
  }
  
}

