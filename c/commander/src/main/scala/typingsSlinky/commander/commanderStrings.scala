package typingsSlinky.commander

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object commanderStrings {
  @js.native
  sealed trait electron extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait user extends js.Object
  
  @scala.inline
  def electron: electron = "electron".asInstanceOf[electron]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

