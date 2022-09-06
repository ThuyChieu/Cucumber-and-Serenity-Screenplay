package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCartPage {
    public static Target BTN_ADD_TO_CART = Target.the("Add to cart").locatedBy("//span[text()='Add to cart']");
    public static Target BTN_SHOPPING_CART = Target.the("Go to cart").locatedBy("//a[@href='/cart']//div[contains(@class,'align-items-center')]");
}
