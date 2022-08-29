package starter.TestRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import starter.navigation.NavigateTo;
import starter.pages.HomePage;

@RunWith(CucumberWithSerenity.class)
public class Run {
    @CastMember(name = "Chieu")
    Actor Chieu;
    @Test
    public void testPerromart(){
        Chieu.wasAbleTo(NavigateTo.thePerromartPage());
        Chieu.attemptsTo();
    }
}
