package typingsSlinky.aceBuilds.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ace {
  type CommandLike = typingsSlinky.aceBuilds.mod.Ace.Command | (js.Function1[/* editor */ typingsSlinky.aceBuilds.mod.Ace.Editor, scala.Unit])
  type CommandMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.aceBuilds.mod.Ace.Command]
  type CompleterCallback = js.Function2[
    /* error */ js.Any, 
    /* completions */ js.Array[typingsSlinky.aceBuilds.mod.Ace.Completion], 
    scala.Unit
  ]
  type MarkerRenderer = js.Function5[
    /* html */ js.Array[java.lang.String], 
    /* range */ typingsSlinky.aceBuilds.mod.Ace.Range, 
    /* left */ scala.Double, 
    /* top */ scala.Double, 
    /* config */ js.Any, 
    scala.Unit
  ]
  type execEventHandler = js.Function1[/* obj */ typingsSlinky.aceBuilds.anon.Args, scala.Unit]
}
