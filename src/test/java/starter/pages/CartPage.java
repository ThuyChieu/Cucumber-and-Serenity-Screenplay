package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static Target BTN_CHECK_OUT = Target.the("Check out product in cart").locatedBy(".CartItems_PlaceOrder__clRYj");
    public static Target QUANTITY_PRODUCT = Target.the("Quantity product in cart").locatedBy("//input[@type='number']");
    public static Target NAME_PRODUCT_IN_CART = Target.the("Name product in cart").locatedBy("/div[contains(@class, 'CartItems_Title')]");
}
