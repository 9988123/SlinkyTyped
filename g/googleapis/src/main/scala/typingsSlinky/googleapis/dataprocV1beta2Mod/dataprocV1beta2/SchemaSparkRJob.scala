package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache SparkR
  * (https://spark.apache.org/docs/latest/sparkr.html) applications on YARN.
  */
@js.native
trait SchemaSparkRJob extends js.Object {
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory
    * of Spark drivers and tasks. Supported file types: .jar, .tar, .tar.gz,
    * .tgz, and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments,
    * such as --conf, that can be set as job properties, since a collision may
    * occur that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. HCFS URIs of files to be copied to the working directory of R
    * drivers and distributed tasks. Useful for naively parallel tasks.
    */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  /**
    * Required. The HCFS URI of the main R file to use as the driver. Must be a
    * .R file.
    */
  var mainRFileUri: js.UndefOr[String] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure
    * SparkR. Properties that conflict with values set by the Cloud Dataproc
    * API may be overwritten. Can include properties set in
    * /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaSparkRJob {
  @scala.inline
  def apply(): SchemaSparkRJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSparkRJob]
  }
  @scala.inline
  implicit class SchemaSparkRJobOps[Self <: SchemaSparkRJob] (val x: Self) extends AnyVal {
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
    def setArchiveUrisVarargs(value: String*): Self = this.set("archiveUris", js.Array(value :_*))
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = this.set("archiveUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveUris: Self = this.set("archiveUris", js.undefined)
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = this.set("fileUris", js.Array(value :_*))
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = this.set("fileUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUris: Self = this.set("fileUris", js.undefined)
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    @scala.inline
    def setMainRFileUri(value: String): Self = this.set("mainRFileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainRFileUri: Self = this.set("mainRFileUri", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

