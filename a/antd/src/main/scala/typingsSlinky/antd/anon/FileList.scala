package typingsSlinky.antd.anon

import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileList extends js.Object {
  var fileList: js.Array[UploadFile[_]] = js.native
}

object FileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): FileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileList]
  }
  @scala.inline
  implicit class FileListOps[Self <: FileList] (val x: Self) extends AnyVal {
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
    def setFileListVarargs(value: UploadFile[js.Any]*): Self = this.set("fileList", js.Array(value :_*))
    @scala.inline
    def setFileList(value: js.Array[UploadFile[_]]): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
  
}

