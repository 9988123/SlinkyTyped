package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassProvider
  extends ClassSansProvider
     with _Provider {
  /**
    * When true, injector returns an array of instances. This is useful to allow multiple
    * providers spread across many files to provide configuration information to a common token.
    */
  var multi: js.UndefOr[Boolean] = js.native
  /**
    * An injection token. (Typically an instance of `Type` or `InjectionToken`, but can be `any`).
    */
  var provide: js.Any = js.native
}

object ClassProvider {
  @scala.inline
  def apply(provide: js.Any, useClass: Type[_]): ClassProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProvider]
  }
  @scala.inline
  implicit class ClassProviderOps[Self <: ClassProvider] (val x: Self) extends AnyVal {
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
    def setProvide(value: js.Any): Self = this.set("provide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
  }
  
}

