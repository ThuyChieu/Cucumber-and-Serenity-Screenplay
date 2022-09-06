package starter.TestRunner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.navigation.NavigateTo;
import starter.pages.CartPage;
import starter.pages.LookForFood;

@RunWith(SerenityRunner.class)
public class Run {
    @CastMember(name = "chieu")
    Actor chieu;
    @Test
    public void shoppingCart(){
        chieu.wasAbleTo(NavigateTo.thePerromartPage());
        chieu.attemptsTo(LookForFood.homePage());
        chieu.attemptsTo(LookForFood.collectionPage("Bronco Salmon"));
        chieu.has(LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"));
        chieu.has(LookForFood.addToCartPage());
        chieu.has(LookForFood.cartPage());
        Assert.assertEquals(CartPage.NAME_PRODUCT_IN_CART.getName(),"Bronco Jerky Salmon Dog Treat 70g");
        chieu.has(LookForFood.checkOutPage("chieuthuymaijenny@gmail.com","Chieu","Mai","Danang","FHome","520147","0963779109"));
    }
}
