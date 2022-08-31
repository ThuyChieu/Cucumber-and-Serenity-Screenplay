package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.pages.CartPage;
import starter.pages.LookForFood;
import starter.pages.SearchPage;

public class SearchStepDefinitions {

    @Given("{actor} open HomePage")
    public void openHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.thePerromartPage());
        actor.wasAbleTo(LookForFood.homePage());
    }

    @When("{actor} looks up")
    public void searchFood(Actor actor) {
        actor.attemptsTo(LookForFood.collectionPage("Bronco Salmon"));
    }

    @When("{actor} click chosen product")
    public void clickChosenProduct(Actor actor) {
        actor.attemptsTo(LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"));
    }

    @When("{actor} add to Cart")
    public void addToCart(Actor actor) {

        actor.attemptsTo(LookForFood.addToCartPage());
    }

    @When("{actor} verify product {string}")
    public void iVerifyProduct(Actor actor, String productName) {
        actor.attemptsTo(Ensure.that(SearchPage.PRODUCT_NAME(productName).hasText(productName));
    }

    @When("{actor} click check out")
    public void clickCheckOut(Actor actor) {

        actor.attemptsTo(LookForFood);
    }

    @When("{actor} add shipping address")
    public void addShippingAddress(Actor actor) {
        actor.attemptsTo(Perform.addShippingAddress(ShippingAddress.email, ShippingAddress.firstName, ShippingAddress.lastName,
                ShippingAddress.address, ShippingAddress.apartment, ShippingAddress.postalCode, ShippingAddress.phone));
    }

    @When("{actor} verify Shipping Address")
    public void iVerifyShippingAddress(Actor actor) {
        actor.has(Ensure.that(CheckOutShippingAddressPage.CONTACT).hasText(ShippingAddress.email));
        actor.has(Ensure.that(CheckOutShippingAddressPage.SHIP_TO).hasText(ShippingAddress.address + ", " + ShippingAddress.apartment + ", Singapore " + ShippingAddress.postalCode));
    }
}
