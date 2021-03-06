package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestExecution extends js.Object {
  /**
    * How the host machine(s) are configured.
    * @OutputOnly
    */
  var environment: js.UndefOr[Environment] = js.native
  /**
    * Unique id set by the backend.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Id of the containing TestMatrix.
    * @OutputOnly
    */
  var matrixId: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Indicates the current progress of the test execution (e.g., FINISHED).
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Additional details about the running test.
    * @OutputOnly
    */
  var testDetails: js.UndefOr[TestDetails] = js.native
  /**
    * How to run the test.
    * @OutputOnly
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.native
  /**
    * The time this test execution was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Where the results for this execution are written.
    * @OutputOnly
    */
  var toolResultsStep: js.UndefOr[ToolResultsStep] = js.native
}

object TestExecution {
  @scala.inline
  def apply(): TestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecution]
  }
  @scala.inline
  implicit class TestExecutionOps[Self <: TestExecution] (val x: Self) extends AnyVal {
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
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMatrixId(value: String): Self = this.set("matrixId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrixId: Self = this.set("matrixId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTestDetails(value: TestDetails): Self = this.set("testDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestDetails: Self = this.set("testDetails", js.undefined)
    @scala.inline
    def setTestSpecification(value: TestSpecification): Self = this.set("testSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSpecification: Self = this.set("testSpecification", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setToolResultsStep(value: ToolResultsStep): Self = this.set("toolResultsStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolResultsStep: Self = this.set("toolResultsStep", js.undefined)
  }
  
}

