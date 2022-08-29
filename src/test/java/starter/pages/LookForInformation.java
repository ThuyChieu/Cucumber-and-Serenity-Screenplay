package starter.pages;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LookForInformation {
    public static Performable homePage() {
        return Task.where("HomePage",
                Click.on(HomePage.BTN_DOG)
                        .then(Click.on(HomePage.BTN_FOOD)));
    }
    public static Performable collectionPage(String name){
        return Task.where("CollectionPage",
                Enter.theValue(name).into(CollectionPage.BAR_SEARCH)
                        .then(Click.on(CollectionPage.BTN_SEARCH)));
    }
    public static Performable searchPage(String name){
        return Task.where("SearchPage",
                Click.on(SearchPage.PRODUCT_NAME(name)));
    }
    public static Performable addToCartPage(){
        return Task.where("AddToCartPage",
                Click.on(AddToCartPage.BTN_ADD_TO_CART)
                        .then(Click.on(AddToCartPage.BTN_SHOPPING_CART)));
    }
}
