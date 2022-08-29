package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class SearchPage {
    public static Target PRODUCT_NAME (String productName){
        return Target.the("product name").locatedBy("//div[text()= '"+productName+"']");
    }
}
