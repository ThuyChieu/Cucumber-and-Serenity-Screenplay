package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCartPage {
    static Target BTN_ADD_TO_CART = Target.the("Add to cart").locatedBy("//span[text()='Add to cart']");
    static Target BTN_SHOPPING_CART = Target.the("Go to cart").locatedBy("//div[@class='px-3 py-3 p-xxl-3 d-flex align-items-center position-relative']//div[@class='Nav_notificationIcon__PO8_E']");
}
