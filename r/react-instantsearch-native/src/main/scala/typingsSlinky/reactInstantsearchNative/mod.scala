package typingsSlinky.reactInstantsearchNative

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialCurrentRefinements
import typingsSlinky.reactInstantsearchCore.anon.PartialMenuProvided
import typingsSlinky.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typingsSlinky.reactInstantsearchCore.anon.PartialRefinementListProv
import typingsSlinky.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typingsSlinky.reactInstantsearchCore.anon.PartialStateResultsProvid
import typingsSlinky.reactInstantsearchCore.anon.PartialStatsProvided
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided
import typingsSlinky.reactInstantsearchCore.mod.BasicDoc
import typingsSlinky.reactInstantsearchCore.mod.ConnectorDescription
import typingsSlinky.reactInstantsearchCore.mod.ConnectorProvided
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsSlinky.reactInstantsearchCore.mod.GeoSearchExposed
import typingsSlinky.reactInstantsearchCore.mod.GeoSearchProvided
import typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru
import typingsSlinky.reactInstantsearchCore.mod.HighlightProps
import typingsSlinky.reactInstantsearchCore.mod.HighlightProvided
import typingsSlinky.reactInstantsearchCore.mod.HitsProvided
import typingsSlinky.reactInstantsearchCore.mod.InfiniteHitsProvided
import typingsSlinky.reactInstantsearchCore.mod.InstantSearchProps
import typingsSlinky.reactInstantsearchCore.mod.MenuExposed
import typingsSlinky.reactInstantsearchCore.mod.MenuProvided
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.RefinementListExposed
import typingsSlinky.reactInstantsearchCore.mod.RefinementListProvided
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided
import typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided
import typingsSlinky.reactInstantsearchCore.mod.StatsProvided
import typingsSlinky.reactInstantsearchCore.mod.TranslatableExposed
import typingsSlinky.reactInstantsearchCore.mod.TranslatableProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Configure ()
    extends Component[js.Any, js.Any, js.Any]
  
  @js.native
  class Index ()
    extends Component[js.Any, js.Object, js.Any]
  
  @js.native
  class InstantSearch ()
    extends Component[InstantSearchProps, js.Object, js.Any]
  
  def connectAutoComplete[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ReactComponentClass[AutocompleteExposed] = js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ReactComponentClass[(Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed] = js.native
  def connectBreadcrumb(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectConfigure(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectCurrentRefinements(stateless: StatelessComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed] = js.native
  def connectGeoSearch(stateless: StatelessComponent[GeoSearchProvided[_]]): ReactComponentClass[GeoSearchExposed] = js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed] = js.native
  def connectHierarchicalMenu(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectHighlight[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ReactComponentClass[HighlightPassedThru[TDoc]] = js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
  def connectHits[THit](stateless: StatelessComponent[HitsProvided[THit]]): ReactComponentClass[js.Object] = js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HitsProvided[THit]]) with js.Object] = js.native
  def connectHitsPerPage(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectInfiniteHits(Composed: ReactComponentClass[InfiniteHitsProvided[_]]): ReactComponentClass[js.Object] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ReactComponentClass[TProps]): ReactComponentClass[(Omit[TProps, InfiniteHitsProvided[THit]]) with js.Object] = js.native
  def connectMenu(stateless: StatelessComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, MenuProvided]) with MenuExposed] = js.native
  def connectNumericMenu(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed] = js.native
  def connectPagination(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectPoweredBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectRange(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectRefinementList(stateless: StatelessComponent[RefinementListProvided]): ReactComponentClass[RefinementListExposed] = js.native
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, RefinementListProvided]) with RefinementListExposed] = js.native
  def connectScrollTo(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectSearchBox(stateless: StatelessComponent[SearchBoxProvided]): ReactComponentClass[SearchBoxExposed] = js.native
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, SearchBoxProvided]) with SearchBoxExposed] = js.native
  def connectSortBy(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def connectStateResults(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ReactComponentClass[js.Object] = js.native
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
  def connectStats(stateless: StatelessComponent[StatsProvided]): ReactComponentClass[js.Object] = js.native
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StatsProvided]) with js.Object] = js.native
  def connectToggleRefinement(Composed: ReactComponentClass[_]): ReactComponentClass[_] = js.native
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ ReactComponentClass[ConnectorProvided[TProvided]], 
    ReactComponentClass[TExposed]
  ]) with (js.Function1[
    /* Composed */ ReactComponentClass[Partial[ConnectorProvided[TProvided]]], 
    ReactComponentClass[
      (Omit[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided]]) with TExposed
    ]
  ]) = js.native
  def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ReactComponentClass[TranslatableProvided], 
    ReactComponentClass[(Omit[TranslatableProvided, TranslatableProvided]) with TranslatableExposed]
  ] = js.native
  @js.native
  object HIGHLIGHT_TAGS extends js.Object {
    var highlightPostTag: String = js.native
    var highlightPreTag: String = js.native
  }
  
}

