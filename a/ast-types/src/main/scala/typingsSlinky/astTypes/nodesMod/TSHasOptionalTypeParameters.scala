package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameters extends js.Object {
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSHasOptionalTypeParameters {
  @scala.inline
  def apply(typeParameters: js.UndefOr[Null | TSTypeParameterDeclarationKind] = js.undefined): TSHasOptionalTypeParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(typeParameters)) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSHasOptionalTypeParameters]
  }
}

