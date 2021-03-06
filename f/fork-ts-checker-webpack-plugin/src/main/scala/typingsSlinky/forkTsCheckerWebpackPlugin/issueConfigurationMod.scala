package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.all
import typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.webpack
import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.forkTsCheckerWebpackPlugin.issueOptionsMod.IssueOptions
import typingsSlinky.forkTsCheckerWebpackPlugin.issuePredicateMod.IssuePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueConfiguration", JSImport.Namespace)
@js.native
object issueConfigurationMod extends js.Object {
  @js.native
  trait IssueConfiguration extends js.Object {
    @JSName("predicate")
    var predicate_Original: IssuePredicate = js.native
    var scope: all | webpack = js.native
    def predicate(issue: Issue): Boolean = js.native
  }
  
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): IssueConfiguration = js.native
  def createIssueConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: IssueOptions
  ): IssueConfiguration = js.native
}

