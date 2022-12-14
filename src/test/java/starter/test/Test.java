package starter.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import starter.navigation.NavigateTo;
import starter.pages.AddToCartPage;
import starter.pages.CartPage;
import starter.pages.CheckOutShippingPage;
import starter.action.LookForFood;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.is;


@RunWith(SerenityRunner.class)
public class Test {
    @CastMember(name = "User")
    Actor user;

    @BeforeEach
    void common() {
        BrowseTheWeb.as(user).getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @org.junit.Test
    @Title("Purchase a package of food")
    public void shoppingCart() {
        givenThat(user).attemptsTo(NavigateTo.thePerromartPage());

        when(user).attemptsTo(LookForFood.homePage());
        user.attemptsTo(
                //Search food and add to cart
                LookForFood.homePage(),
                LookForFood.collectionPage("Bronco Salmon"),
                LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"),
                WaitUntil.the(AddToCartPage.BTN_ADD_TO_CART,isVisible()).forNoMoreThan(10).seconds(),
                LookForFood.addToCartPage(),

                //Verify 'product name'
                Ensure.that(CartPage.NAME_PRODUCT_IN_CART).hasText("Bronco Jerky Salmon Dog Treat 70g"),

                //Input shipping information
                LookForFood.cartPage(),
                LookForFood.checkOutPage("chieuthuymaijenny@gmail.com", "Chieu", "Mai", "Danang", "FHome", "520147", "0963779109"),

                //Verify shipping information
                Ensure.that(CheckOutShippingPage.LBL_CONTACT).hasText("chieuthuymaijenny@gmail.com"),
                Ensure.that(CheckOutShippingPage.LBL_SHIP_TO).hasText("Danang" + ", FHome" + ", Singapore " + "520147")
        );
        then(user).should(
                seeThat("", Text.of(CheckOutShippingPage.LBL_CONTACT), is("chieuthuymaijenny@gmail.com"))
        );
    }
}
