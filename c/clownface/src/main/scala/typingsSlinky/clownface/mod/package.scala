package typingsSlinky.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddCallback[D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */, X /* <: typingsSlinky.rdfJs.mod.Term */] = js.Function1[/* added */ typingsSlinky.clownface.mod.Clownface[X, D], scala.Unit]
  type AnyContext = js.UndefOr[typingsSlinky.rdfJs.mod.Term | js.Array[typingsSlinky.rdfJs.mod.Term]]
  type Iteratee[T /* <: typingsSlinky.clownface.mod.AnyContext */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.Clownface[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any) | T, 
    D
  ]
  type SafeClownface[T /* <: typingsSlinky.rdfJs.mod.Term */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.Clownface[T | js.Array[T], D]
  type SingleContextClownface[T /* <: typingsSlinky.rdfJs.mod.Term */, D /* <: typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad] */] = typingsSlinky.clownface.mod.Clownface[T, D]
  type SingleOrArray[T] = T | js.Array[T]
  type SingleOrArrayOfTerms[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.SingleOrArray[X] | (typingsSlinky.clownface.mod.SafeClownface[
    X, 
    typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ])
  type SingleOrArrayOfTermsOrLiterals[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.SingleOrArray[typingsSlinky.clownface.mod.TermOrLiteral[X]]
  type SingleOrOneElementArray[T] = T | js.Array[T]
  type TermOrClownface[X /* <: typingsSlinky.rdfJs.mod.Term */] = (typingsSlinky.clownface.mod.SafeClownface[
    X, 
    typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
  ]) | X
  type TermOrLiteral[X /* <: typingsSlinky.rdfJs.mod.Term */] = typingsSlinky.clownface.mod.TermOrClownface[X] | java.lang.String | scala.Double | scala.Boolean
}
