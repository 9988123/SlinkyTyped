package typingsSlinky.reduxRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxRouterStrings {
  @js.native
  sealed trait history extends js.Object
  
  @js.native
  sealed trait location extends js.Object
  
  @js.native
  sealed trait `match` extends js.Object
  
  @js.native
  sealed trait matchPath extends js.Object
  
  @js.native
  sealed trait staticContext extends js.Object
  
  @js.native
  sealed trait useParams extends js.Object
  
  @js.native
  sealed trait useRouteMatch extends js.Object
  
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  @scala.inline
  def matchPath: matchPath = "matchPath".asInstanceOf[matchPath]
  @scala.inline
  def staticContext: staticContext = "staticContext".asInstanceOf[staticContext]
  @scala.inline
  def useParams: useParams = "useParams".asInstanceOf[useParams]
  @scala.inline
  def useRouteMatch: useRouteMatch = "useRouteMatch".asInstanceOf[useRouteMatch]
}

