package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation-tree relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationTree")
@js.native
class NavigationTree protected () extends MenuWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNavigationTree: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NavigationTree")
@js.native
object NavigationTree extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  def createInBuildingBlockUnderWidget(container: BuildingBlock): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  def createInDataViewUnderFooterWidget(container: DataView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDataViewUnderWidget(container: DataView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInDivContainerUnderWidget(container: DivContainer): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInGroupBoxUnderWidget(container: GroupBox): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderLeftWidget(container: Header): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInHeaderUnderRightWidget(container: Header): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInLayoutUnderWidget(container: Layout): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInLayoutUnderWidgets(container: Layout): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInListViewUnderWidget(container: ListView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  def createInNativeLayoutUnderWidgets(container: NativeLayout): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInNavigationListItemUnderWidget(container: NavigationListItem): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderParameterWidget(container: ReportPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  def createInReportPaneUnderReportWidget(container: ReportPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSnippetUnderWidget(container: Snippet): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderFirstWidget(container: SplitPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInSplitPaneUnderSecondWidget(container: SplitPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTabPageUnderWidget(container: TabPage): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTableCellUnderWidget(container: TableCell): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): NavigationTree = js.native
  /**
    * Creates and returns a new NavigationTree instance in the SDK and on the server.
    * The new NavigationTree will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): NavigationTree = js.native
}

