package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "mergeUnion")
@js.native
object mergeUnion extends js.Object {
  def apply(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def apply(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
}

