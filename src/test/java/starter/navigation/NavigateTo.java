package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.pages.PerromartPage;

public class NavigateTo {
    public static Performable thePerromartPage() {
        return Task.where("Opens the Perromart home page",
                Open.browserOn().the(PerromartPage.class));
    }
}
