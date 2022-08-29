package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

class CartPage {
    static Target BTN_CHECK_OUT = Target.the("Check out product in cart").locatedBy(".CartItems_PlaceOrder__clRYj");
    static Target QUANTITY_PRODUCT = Target.the("Quantity product in cart").locatedBy("//input[@type='number']");
    static Target NAME_PRODUCT_IN_CART = Target.the("Name uct in cart ").locatedBy("/div[contains(@class, 'CartItems_Title')]");
}
