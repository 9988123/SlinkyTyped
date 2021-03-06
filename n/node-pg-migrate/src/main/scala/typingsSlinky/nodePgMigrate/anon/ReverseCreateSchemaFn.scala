package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchemaFn
import typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateSchemaFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateSchemaFn = js.native
  def reverse(schemaName: String): String | js.Array[String] = js.native
  def reverse(schemaName: String, schemaOptions: CreateSchemaOptions with DropOptions): String | js.Array[String] = js.native
}

