package typingsSlinky.cordovaPluginWebsql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var displayName: String = js.native
  var name: String = js.native
  var size: Double = js.native
  var version: String = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def readTransaction(callback: js.Function1[/* transaction */ SqlTransaction, Unit]): Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit]
  ): Unit = js.native
  def readTransaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  /**
    * Starts new transaction.
    * @param callback        Function, that will be called when transaction starts.
    * @param errorCallback   Called, when Transaction fails.
    * @param successCallback Called, when transaction committed.
    */
  def transaction(callback: js.Function1[/* transaction */ SqlTransaction, Unit]): Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit]
  ): Unit = js.native
  def transaction(
    callback: js.Function1[/* transaction */ SqlTransaction, Unit],
    errorCallback: js.Function1[/* error */ SqlError, Unit],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
}

