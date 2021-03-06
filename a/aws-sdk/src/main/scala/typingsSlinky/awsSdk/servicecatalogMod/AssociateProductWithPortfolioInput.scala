package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateProductWithPortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * The identifier of the source portfolio.
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.native
}

object AssociateProductWithPortfolioInput {
  @scala.inline
  def apply(PortfolioId: Id, ProductId: Id): AssociateProductWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateProductWithPortfolioInput]
  }
  @scala.inline
  implicit class AssociateProductWithPortfolioInputOps[Self <: AssociateProductWithPortfolioInput] (val x: Self) extends AnyVal {
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
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setSourcePortfolioId(value: Id): Self = this.set("SourcePortfolioId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePortfolioId: Self = this.set("SourcePortfolioId", js.undefined)
  }
  
}

