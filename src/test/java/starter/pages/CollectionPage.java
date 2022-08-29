package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CollectionPage {
    static Target BAR_SEARCH = Target.the("search field").locatedBy("//input[@placeholder='Search for products, brands and more']");
    static Target BTN_SEARCH = Target.the("click search button").locatedBy(".NavSearchBar_searchIconDiv__Vr5NB");
}
