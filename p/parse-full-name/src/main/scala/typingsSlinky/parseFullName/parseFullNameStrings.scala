package typingsSlinky.parseFullName

import typingsSlinky.parseFullName.mod.partToReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parseFullNameStrings {
  @js.native
  sealed trait all extends partToReturn
  
  @js.native
  sealed trait error extends partToReturn
  
  @js.native
  sealed trait first extends partToReturn
  
  @js.native
  sealed trait last extends partToReturn
  
  @js.native
  sealed trait middle extends partToReturn
  
  @js.native
  sealed trait nick extends partToReturn
  
  @js.native
  sealed trait suffix extends partToReturn
  
  @js.native
  sealed trait title extends partToReturn
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def nick: nick = "nick".asInstanceOf[nick]
  @scala.inline
  def suffix: suffix = "suffix".asInstanceOf[suffix]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
}

