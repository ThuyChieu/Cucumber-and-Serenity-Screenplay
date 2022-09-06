package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutShippingPage {
    public static Target LBL_CONTACT = Target.the("contact").locatedBy("//bdo[@dir='ltr']");
    public static Target LBL_SHIP_TO = Target.the("Ship to").locatedBy("//address[@class='address address--tight']");
}
