package starter.TestRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.navigation.NavigateTo;
import starter.pages.CartPage;
import starter.pages.HomePage;
import starter.pages.LookForFood;

@RunWith(SerenityRunner.class)
public class Run {
    @CastMember(name = "Chieu")
    Actor Chieu;
    @Test
    public void testPerromart(){
        Chieu.wasAbleTo(NavigateTo.thePerromartPage());
        Chieu.attemptsTo(LookForFood.homePage());
        Chieu.attemptsTo(LookForFood.collectionPage("Bronco Salmon"));
        Chieu.has(LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"));
        Chieu.has(LookForFood.addToCartPage());
        Assert.assertEquals(CartPage.NAME_PRODUCT_IN_CART,"Bronco Jerky Salmon Dog Treat 70g");
    }
}
