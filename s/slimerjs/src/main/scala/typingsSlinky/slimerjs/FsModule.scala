package typingsSlinky.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsModule extends js.Object {
  var separator: String = js.native
  var workingDirectory: String = js.native
  def absolute(path: String): String = js.native
  def base(path: String): String = js.native
  def basename(path: String): String = js.native
  def changeWorkingDirectory(path: String): Unit = js.native
  def copy(source: String, target: String): Unit = js.native
  def copyTree(source: String, target: String): Unit = js.native
  def directory(path: String): String = js.native
  def dirname(path: String): String = js.native
  def exists(path: String): Boolean = js.native
  def extension(path: String, withoutdot: Boolean): String = js.native
  def isAbsolute(path: String): Boolean = js.native
  def isDirectory(path: String): Boolean = js.native
  def isExecutable(path: String): Boolean = js.native
  def isFile(path: String): Boolean = js.native
  def isLink(path: String): Boolean = js.native
  def isReadable(path: String): Boolean = js.native
  def isWritable(path: String): Boolean = js.native
  // last argument should be the filename
  def join(basepath: String, dirname: String, args: String*): String = js.native
  def lastModified(path: String): js.Date = js.native
  def list(path: String): js.Array[String] = js.native
  def makeDirectory(path: String): Unit = js.native
  def makeTree(path: String): Unit = js.native
  def mkpath(path: String): Unit = js.native
  def move(source: String, target: String): Unit = js.native
  def open(filename: String, opts: Opts): Unit = js.native
  def read(path: String, mode: String): String = js.native
  def readLink(path: String): String = js.native
  def remove(path: String): Unit = js.native
  def removeDirectory(path: String): Unit = js.native
  def removeTree(path: String): Unit = js.native
  def rename(path: String, newname: String): Unit = js.native
  def rmdir(path: String): Unit = js.native
  def size(path: String): Double = js.native
  def split(path: String): js.Array[String] = js.native
  def touch(path: String, date: js.Date): Unit = js.native
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: String, content: js.Any, mode: String): Unit = js.native
}

object FsModule {
  @scala.inline
  def apply(
    absolute: String => String,
    base: String => String,
    basename: String => String,
    changeWorkingDirectory: String => Unit,
    copy: (String, String) => Unit,
    copyTree: (String, String) => Unit,
    directory: String => String,
    dirname: String => String,
    exists: String => Boolean,
    extension: (String, Boolean) => String,
    isAbsolute: String => Boolean,
    isDirectory: String => Boolean,
    isExecutable: String => Boolean,
    isFile: String => Boolean,
    isLink: String => Boolean,
    isReadable: String => Boolean,
    isWritable: String => Boolean,
    join: (String, String, /* repeated */ String) => String,
    lastModified: String => js.Date,
    list: String => js.Array[String],
    makeDirectory: String => Unit,
    makeTree: String => Unit,
    mkpath: String => Unit,
    move: (String, String) => Unit,
    open: (String, Opts) => Unit,
    read: (String, String) => String,
    readLink: String => String,
    remove: String => Unit,
    removeDirectory: String => Unit,
    removeTree: String => Unit,
    rename: (String, String) => Unit,
    rmdir: String => Unit,
    separator: String,
    size: String => Double,
    split: String => js.Array[String],
    touch: (String, js.Date) => Unit,
    workingDirectory: String,
    write: (String, js.Any, String) => Unit
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = js.Any.fromFunction1(absolute), base = js.Any.fromFunction1(base), basename = js.Any.fromFunction1(basename), changeWorkingDirectory = js.Any.fromFunction1(changeWorkingDirectory), copy = js.Any.fromFunction2(copy), copyTree = js.Any.fromFunction2(copyTree), directory = js.Any.fromFunction1(directory), dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), extension = js.Any.fromFunction2(extension), isAbsolute = js.Any.fromFunction1(isAbsolute), isDirectory = js.Any.fromFunction1(isDirectory), isExecutable = js.Any.fromFunction1(isExecutable), isFile = js.Any.fromFunction1(isFile), isLink = js.Any.fromFunction1(isLink), isReadable = js.Any.fromFunction1(isReadable), isWritable = js.Any.fromFunction1(isWritable), join = js.Any.fromFunction3(join), lastModified = js.Any.fromFunction1(lastModified), list = js.Any.fromFunction1(list), makeDirectory = js.Any.fromFunction1(makeDirectory), makeTree = js.Any.fromFunction1(makeTree), mkpath = js.Any.fromFunction1(mkpath), move = js.Any.fromFunction2(move), open = js.Any.fromFunction2(open), read = js.Any.fromFunction2(read), readLink = js.Any.fromFunction1(readLink), remove = js.Any.fromFunction1(remove), removeDirectory = js.Any.fromFunction1(removeDirectory), removeTree = js.Any.fromFunction1(removeTree), rename = js.Any.fromFunction2(rename), rmdir = js.Any.fromFunction1(rmdir), separator = separator.asInstanceOf[js.Any], size = js.Any.fromFunction1(size), split = js.Any.fromFunction1(split), touch = js.Any.fromFunction2(touch), workingDirectory = workingDirectory.asInstanceOf[js.Any], write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[FsModule]
  }
  @scala.inline
  implicit class FsModuleOps[Self <: FsModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbsolute(value: String => String): Self = this.set("absolute", js.Any.fromFunction1(value))
    @scala.inline
    def setBase(value: String => String): Self = this.set("base", js.Any.fromFunction1(value))
    @scala.inline
    def setBasename(value: String => String): Self = this.set("basename", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeWorkingDirectory(value: String => Unit): Self = this.set("changeWorkingDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: (String, String) => Unit): Self = this.set("copy", js.Any.fromFunction2(value))
    @scala.inline
    def setCopyTree(value: (String, String) => Unit): Self = this.set("copyTree", js.Any.fromFunction2(value))
    @scala.inline
    def setDirectory(value: String => String): Self = this.set("directory", js.Any.fromFunction1(value))
    @scala.inline
    def setDirname(value: String => String): Self = this.set("dirname", js.Any.fromFunction1(value))
    @scala.inline
    def setExists(value: String => Boolean): Self = this.set("exists", js.Any.fromFunction1(value))
    @scala.inline
    def setExtension(value: (String, Boolean) => String): Self = this.set("extension", js.Any.fromFunction2(value))
    @scala.inline
    def setIsAbsolute(value: String => Boolean): Self = this.set("isAbsolute", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDirectory(value: String => Boolean): Self = this.set("isDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setIsExecutable(value: String => Boolean): Self = this.set("isExecutable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFile(value: String => Boolean): Self = this.set("isFile", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLink(value: String => Boolean): Self = this.set("isLink", js.Any.fromFunction1(value))
    @scala.inline
    def setIsReadable(value: String => Boolean): Self = this.set("isReadable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsWritable(value: String => Boolean): Self = this.set("isWritable", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: (String, String, /* repeated */ String) => String): Self = this.set("join", js.Any.fromFunction3(value))
    @scala.inline
    def setLastModified(value: String => js.Date): Self = this.set("lastModified", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: String => js.Array[String]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeDirectory(value: String => Unit): Self = this.set("makeDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeTree(value: String => Unit): Self = this.set("makeTree", js.Any.fromFunction1(value))
    @scala.inline
    def setMkpath(value: String => Unit): Self = this.set("mkpath", js.Any.fromFunction1(value))
    @scala.inline
    def setMove(value: (String, String) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def setOpen(value: (String, Opts) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    @scala.inline
    def setRead(value: (String, String) => String): Self = this.set("read", js.Any.fromFunction2(value))
    @scala.inline
    def setReadLink(value: String => String): Self = this.set("readLink", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveDirectory(value: String => Unit): Self = this.set("removeDirectory", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTree(value: String => Unit): Self = this.set("removeTree", js.Any.fromFunction1(value))
    @scala.inline
    def setRename(value: (String, String) => Unit): Self = this.set("rename", js.Any.fromFunction2(value))
    @scala.inline
    def setRmdir(value: String => Unit): Self = this.set("rmdir", js.Any.fromFunction1(value))
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String => Double): Self = this.set("size", js.Any.fromFunction1(value))
    @scala.inline
    def setSplit(value: String => js.Array[String]): Self = this.set("split", js.Any.fromFunction1(value))
    @scala.inline
    def setTouch(value: (String, js.Date) => Unit): Self = this.set("touch", js.Any.fromFunction2(value))
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: (String, js.Any, String) => Unit): Self = this.set("write", js.Any.fromFunction3(value))
  }
  
}

