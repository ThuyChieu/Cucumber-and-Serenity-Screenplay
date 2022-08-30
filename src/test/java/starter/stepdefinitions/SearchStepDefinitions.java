package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.pages.LookForFood;
import starter.pages.HomePage;

//public class SearchStepDefinitions {
//
//    @Given("{actor} is researching things on the internet")
//    public void researchingThings(Actor actor) {
//        actor.wasAbleTo(NavigateTo.thePerromartPage());
//    }
//
//    @When("{actor} looks up {string}")
//    public void searchesFor(Actor actor, String term) {
//        actor.attemptsTo(
//                LookForFood.homePage(term)
//        );
//    }
//
//    @Then("{actor} should see information about {string}")
//    public void should_see_information_about(Actor actor, String term) {
//        actor.attemptsTo(
//                Ensure.that(HomePage.HEADING).hasText(term)
//        );
//    }
//}
