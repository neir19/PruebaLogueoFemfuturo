package starter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaOpen implements Task {

    public static Performable abrir() {
        return  instrumented(PaginaOpen.class);
    }

    @Override
    @Step("ingresa a la pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("http://www.femfuturo.com.co/")
        );
    }
}
