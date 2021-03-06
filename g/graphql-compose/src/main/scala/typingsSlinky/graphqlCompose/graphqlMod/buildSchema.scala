package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typingsSlinky.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
}

