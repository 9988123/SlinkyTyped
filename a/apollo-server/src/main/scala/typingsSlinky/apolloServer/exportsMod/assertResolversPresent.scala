package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "assertResolversPresent")
@js.native
object assertResolversPresent extends js.Object {
  def apply(schema: GraphQLSchema): Unit = js.native
  def apply(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
}

