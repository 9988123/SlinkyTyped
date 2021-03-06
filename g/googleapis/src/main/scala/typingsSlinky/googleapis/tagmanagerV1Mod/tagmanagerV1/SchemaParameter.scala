package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Parameter.
  */
@js.native
trait SchemaParameter extends js.Object {
  /**
    * The named key that uniquely identifies a parameter. Required for
    * top-level parameters, as well as map values. Ignored for list values.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This list parameter&#39;s parameters (keys will be ignored).
    */
  var list: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * This map parameter&#39;s parameters (must have keys; keys must be
    * unique).
    */
  var map: js.UndefOr[js.Array[SchemaParameter]] = js.native
  /**
    * The parameter type. Valid values are:  - boolean: The value represents a
    * boolean, represented as &#39;true&#39; or &#39;false&#39;  - integer: The
    * value represents a 64-bit signed integer value, in base 10  - list: A
    * list of parameters should be specified  - map: A map of parameters should
    * be specified  - template: The value represents any text; this can include
    * variable references (even variable references that might return
    * non-string types)
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * A parameter&#39;s value (may contain variable references such as
    * &quot;{{myVariable}}&quot;) as appropriate to the specified type.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaParameter {
  @scala.inline
  def apply(): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameter]
  }
  @scala.inline
  implicit class SchemaParameterOps[Self <: SchemaParameter] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setListVarargs(value: SchemaParameter*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[SchemaParameter]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setMapVarargs(value: SchemaParameter*): Self = this.set("map", js.Array(value :_*))
    @scala.inline
    def setMap(value: js.Array[SchemaParameter]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

