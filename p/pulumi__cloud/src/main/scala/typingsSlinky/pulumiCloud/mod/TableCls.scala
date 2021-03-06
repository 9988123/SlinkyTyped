package typingsSlinky.pulumiCloud.mod

import typingsSlinky.pulumiCloud.tableMod.PrimaryKeyType
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Table")
@js.native
class TableCls protected ()
  extends typingsSlinky.pulumiCloud.tableMod.Table {
  /**
    * Creates a new Table.
    *
    * @param name A unique name for the table.
    * @param primaryKey An optional primary key name.
    * @param primaryKeyType An optional primary key type.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, primaryKey: Input[String]) = this()
  def this(name: String, primaryKey: js.UndefOr[Input[String]], primaryKeyType: Input[PrimaryKeyType]) = this()
  def this(
    name: String,
    primaryKey: js.UndefOr[Input[String]],
    primaryKeyType: js.UndefOr[Input[PrimaryKeyType]],
    opts: ResourceOptions
  ) = this()
}

