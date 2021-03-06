package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  timeout :number}> */
@js.native
trait DeepPartialtimeoutnumber extends js.Object {
  var timeout: js.UndefOr[DeepPartial[Double]] = js.native
}

object DeepPartialtimeoutnumber {
  @scala.inline
  def apply(): DeepPartialtimeoutnumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialtimeoutnumber]
  }
  @scala.inline
  implicit class DeepPartialtimeoutnumberOps[Self <: DeepPartialtimeoutnumber] (val x: Self) extends AnyVal {
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
    def setTimeout(value: DeepPartial[Double]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

