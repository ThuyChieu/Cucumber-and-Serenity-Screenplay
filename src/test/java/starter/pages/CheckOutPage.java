package starter.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {
    public static Target TXT_EMAIL = Target.the("Input email").locatedBy("//input[@id='checkout_email']");
    public static Target TXT_FIRSTNAME = Target.the("Input firstname").locatedBy("//input[@id='checkout_shipping_address_first_name']");
    public static Target TXT_LASTNAME = Target.the("Input lastname").locatedBy("//input[@id='checkout_shipping_address_last_name']");
    public static Target TXT_ADDRESS = Target.the("Input address").locatedBy("//input[@id='checkout_shipping_address_address1']");
    public static Target TXT_APARTMENT = Target.the("Input apartment").locatedBy("//input[@id='checkout_shipping_address_address2']");
    public static Target TXT_POSTAL_CODE = Target.the("Input postal code").locatedBy("//input[@id='checkout_shipping_address_zip']");
    public static Target TXT_PHONE = Target.the("Input phone").locatedBy("//input[@id='checkout_shipping_address_phone']");
    public static Target BTN_CONTINUE_SHOPPING = Target.the("Click continue shopping").locatedBy(".step__footer__continue-btn");
}


