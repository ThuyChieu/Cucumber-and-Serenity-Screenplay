package starter.pages;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LookForFood {
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
    public static Performable cartPage(){
        return Task.where("CartPage",
                Click.on(CartPage.BTN_CHECK_OUT));
    }
    public static Performable checkOutPage(String email, String firstName, String lastName, String address, String apartment, String postalCode, String phone){
        return Task.where("CheckOutPage",
                Enter.theValue(email).into(CheckOutPage.TXT_EMAIL)
                        .then(Enter.theValue(firstName).into(CheckOutPage.TXT_FIRSTNAME)
                                .then(Enter.theValue(lastName).into(CheckOutPage.TXT_LASTNAME)
                                        .then(Enter.theValue(address).into(CheckOutPage.TXT_ADDRESS)
                                                .then(Enter.theValue(apartment).into(CheckOutPage.TXT_APARTMENT)
                                                        .then(Enter.theValue(postalCode).into(CheckOutPage.TXT_POSTAL_CODE)
                                                                .then(Enter.theValue(phone).into(CheckOutPage.TXT_PHONE)
                                                                        .then(Click.on(CheckOutPage.BTN_CONTINUE_SHOPPING)))))))));
    }
}
