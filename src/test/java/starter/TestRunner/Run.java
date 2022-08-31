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

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

@RunWith(SerenityRunner.class)
public class Run {
    @CastMember(name = "Chieu")
    Actor Chieu;
    @Test
    public void shoppingCart(){
//        Chieu.wasAbleTo(NavigateTo.thePerromartPage());
//        Chieu.attemptsTo(LookForFood.homePage());
//        Chieu.attemptsTo(LookForFood.collectionPage("Bronco Salmon"));
//        Chieu.has(LookForFood.searchPage("Bronco Jerky Salmon Dog Treat 70g"));
//        Chieu.has(LookForFood.addToCartPage());
//        Chieu.has(LookForFood.cartPage());
//        Assert.assertEquals(CartPage.NAME_PRODUCT_IN_CART.getName(),"Bronco Jerky Salmon Dog Treat 70g");
//        Chieu.has(LookForFood.checkOutPage("chieuthuymaijenny@gmail.com","Chieu","Mai","Danang","FHome","520147","0963779109"));
        givenThat(Chieu).wasAbleTo(
                NavigateTo.thePerromartPage());
        when(Chieu).attemptsTo();

    }
}
