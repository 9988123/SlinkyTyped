package typingsSlinky.materialToolbar.constantsMod

import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-at-last-row`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed-lastrow-only`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--fixed`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-default-behavior`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-maximized`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible-space-minimized`
import typingsSlinky.materialToolbar.materialToolbarStrings.`mdc-toolbar--flexible`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCStrings * / any */ @js.native
trait cssClasses extends js.Object {
  var FIXED: `mdc-toolbar--fixed` = js.native
  var FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row` = js.native
  var FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only` = js.native
  var FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior` = js.native
  var FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized` = js.native
  var FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized` = js.native
  var TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    FIXED: `mdc-toolbar--fixed`,
    FIXED_AT_LAST_ROW: `mdc-toolbar--fixed-at-last-row`,
    FIXED_LASTROW: `mdc-toolbar--fixed-lastrow-only`,
    FLEXIBLE_DEFAULT_BEHAVIOR: `mdc-toolbar--flexible-default-behavior`,
    FLEXIBLE_MAX: `mdc-toolbar--flexible-space-maximized`,
    FLEXIBLE_MIN: `mdc-toolbar--flexible-space-minimized`,
    TOOLBAR_ROW_FLEXIBLE: `mdc-toolbar--flexible`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], FIXED_AT_LAST_ROW = FIXED_AT_LAST_ROW.asInstanceOf[js.Any], FIXED_LASTROW = FIXED_LASTROW.asInstanceOf[js.Any], FLEXIBLE_DEFAULT_BEHAVIOR = FLEXIBLE_DEFAULT_BEHAVIOR.asInstanceOf[js.Any], FLEXIBLE_MAX = FLEXIBLE_MAX.asInstanceOf[js.Any], FLEXIBLE_MIN = FLEXIBLE_MIN.asInstanceOf[js.Any], TOOLBAR_ROW_FLEXIBLE = TOOLBAR_ROW_FLEXIBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
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
    def setFIXED(value: `mdc-toolbar--fixed`): Self = this.set("FIXED", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIXED_AT_LAST_ROW(value: `mdc-toolbar--fixed-at-last-row`): Self = this.set("FIXED_AT_LAST_ROW", value.asInstanceOf[js.Any])
    @scala.inline
    def setFIXED_LASTROW(value: `mdc-toolbar--fixed-lastrow-only`): Self = this.set("FIXED_LASTROW", value.asInstanceOf[js.Any])
    @scala.inline
    def setFLEXIBLE_DEFAULT_BEHAVIOR(value: `mdc-toolbar--flexible-default-behavior`): Self = this.set("FLEXIBLE_DEFAULT_BEHAVIOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFLEXIBLE_MAX(value: `mdc-toolbar--flexible-space-maximized`): Self = this.set("FLEXIBLE_MAX", value.asInstanceOf[js.Any])
    @scala.inline
    def setFLEXIBLE_MIN(value: `mdc-toolbar--flexible-space-minimized`): Self = this.set("FLEXIBLE_MIN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOOLBAR_ROW_FLEXIBLE(value: `mdc-toolbar--flexible`): Self = this.set("TOOLBAR_ROW_FLEXIBLE", value.asInstanceOf[js.Any])
  }
  
}

