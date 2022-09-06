package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target CLOSE_POPUP = Target.the("button close pop up").locatedBy("//button[@tabindex='0']");
    public static final Target BTN_DOG = Target.the("click button dog").locatedBy("//div[@class='navBorder'][normalize-space()='Dog']");
    public static final Target BTN_FOOD = Target.the("click button food").locatedBy("//div[text()='Food']");
}
