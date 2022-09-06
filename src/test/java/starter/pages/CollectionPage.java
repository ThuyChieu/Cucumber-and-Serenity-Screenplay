package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CollectionPage {
    public static Target BAR_SEARCH = Target.the("search field").locatedBy("//input[@placeholder='Search for products, brands and more']");
    public static Target BTN_SEARCH = Target.the("click search button").locatedBy("//*[contains(@class,'NavSearchBar_searchIconDiv')]");
}
