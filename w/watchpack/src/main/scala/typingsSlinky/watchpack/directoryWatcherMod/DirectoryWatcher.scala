package typingsSlinky.watchpack.directoryWatcherMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.gracefulFs.mod.Stats
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.watchpack.mod.WatcherOptions
import typingsSlinky.watchpack.watchpackBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryWatcher extends EventEmitter {
  var directories: StringDictionary[typingsSlinky.watchpack.watcherMod.^  | `true`] = js.native
  var files: StringDictionary[js.Tuple2[Double, Double]] = js.native
  var initialScan: Boolean = js.native
  var initialScanRemoved: js.Array[String] = js.native
  var nestedWatching: Boolean = js.native
  var options: WatcherOptions = js.native
  var path: String = js.native
  var refs: Double = js.native
  var watcher: FSWatcher = js.native
  var watchers: StringDictionary[js.Array[typingsSlinky.watchpack.watcherMod.^]] = js.native
  def close(): Unit = js.native
  def createNestedWatcher(directoryPath: String): Unit = js.native
  def doInitialScan(): Unit = js.native
  def getTimes(): StringDictionary[Double] = js.native
  def onChange(filePath: String, stat: Stats): Unit = js.native
  def onDirectoryAdded(directoryPath: String): Unit = js.native
  def onDirectoryUnlinked(directoryPath: String): Unit = js.native
  def onFileAdded(filePath: String, stat: Stats): Unit = js.native
  def onFileUnlinked(filePath: String): Unit = js.native
  def onWatcherError(): Unit = js.native
  def setDirectory(directoryPath: String, exist: Boolean, initial: Boolean): Unit = js.native
  def setFileTime(filePath: String, mtime: Double, initial: Boolean): Unit = js.native
  def setFileTime(filePath: String, mtime: Double, initial: Boolean, `type`: String): Unit = js.native
  def setFileTime(filePath: String, mtime: Double, initial: Boolean, `type`: Boolean): Unit = js.native
  def setNestedWatching(flag: Boolean): Unit = js.native
  def watch(filePath: String, startTime: Double): typingsSlinky.watchpack.watcherMod.^ = js.native
}

