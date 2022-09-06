package starter.TestRunner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.navigation.NavgiateTo;
import starter.pages.CartPage;
import starter.pages.CheckOutShipping;
import starter.pages.LookForFood;


@RunWith(SerenityRunner.class)
public class Run {
    @CastMember(name = "chieu")
    Actor chieu;

    @Test
    public void shoppingCart() {
        chieu.wasAbleTo(NavgiateTo.thePerromartPage());
        chieu.attemptsTo(LookForFood.homePage());
        chieu.attemptsTo(LookForFood.collectionPage("Bronco Salmon"));
        chieu.has(LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"));
        chieu.has(LookForFood.addToCartPage());
        chieu.attemptsTo(Ensure.that(CartPage.NAME_PRODUCT_IN_CART).hasText("Bronco Jerky Salmon Dog Treat 70g"));
        chieu.has(LookForFood.cartPage());
        chieu.has(LookForFood.checkOutPage("chieuthuymaijenny@gmail.com", "Chieu", "Mai", "Danang", "FHome", "520147", "0963779109"));
        chieu.attemptsTo(Ensure.that(CheckOutShipping.CONTACT).hasText("chieuthuymaijenny@gmail.com"));
        chieu.attemptsTo(Ensure.that(CheckOutShipping.SHIP_TO).hasText("Danang" + ", FHome" + ", Singapore " + "520147"));




    }
}
