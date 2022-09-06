package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutShipping {
    public static Target CONTACT = Target.the("contact").locatedBy("//bdo[@dir='ltr']");
    public static Target SHIP_TO = Target.the("Ship to").locatedBy("//address[@class='address address--tight']");
}
