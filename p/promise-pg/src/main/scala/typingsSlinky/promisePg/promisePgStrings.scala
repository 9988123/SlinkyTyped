package typingsSlinky.promisePg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promisePgStrings {
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait notice extends js.Object
  
  @js.native
  sealed trait notification extends js.Object
  
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
}

