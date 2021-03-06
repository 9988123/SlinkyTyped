package typingsSlinky.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[
    /* error */ js.Error | typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError, 
    scala.Unit
  ]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[
      typingsSlinky.firebaseStorage.observerMod.NextFn[T] | typingsSlinky.firebaseStorage.observerMod.StorageObserver[T] | scala.Null
    ], 
    /* error */ js.UndefOr[typingsSlinky.firebaseStorage.observerMod.ErrorFn | scala.Null], 
    /* complete */ js.UndefOr[typingsSlinky.firebaseStorage.observerMod.CompleteFn | scala.Null], 
    typingsSlinky.firebaseStorage.observerMod.Unsubscribe
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
