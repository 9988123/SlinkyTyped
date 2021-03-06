package typingsSlinky.istanbulMiddleware

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.istanbulMiddleware.anon.ResetOnGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createClientHandler(root: String): js.Any = js.native
  def createClientHandler(root: String, opts: typingsSlinky.istanbulMiddleware.anon.Matcher): js.Any = js.native
  def createHandler(): js.Any = js.native
  def createHandler(opts: ResetOnGet): js.Any = js.native
  def hookLoader(matcherOrRoot: String): Unit = js.native
  def hookLoader(matcherOrRoot: String, opts: typingsSlinky.istanbulMiddleware.anon.PostLoadHook): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher, opts: typingsSlinky.istanbulMiddleware.anon.PostLoadHook): Unit = js.native
  type ClientMatcher = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], Boolean]
  type Matcher = js.Function1[/* file */ String, Boolean]
  type PathTransformer = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ Boolean, 
    PostLoadHookFn
  ]
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}

