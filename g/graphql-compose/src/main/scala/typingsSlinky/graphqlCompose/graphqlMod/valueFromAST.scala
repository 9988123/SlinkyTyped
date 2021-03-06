package typingsSlinky.graphqlCompose.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "valueFromAST")
@js.native
object valueFromAST extends js.Object {
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

