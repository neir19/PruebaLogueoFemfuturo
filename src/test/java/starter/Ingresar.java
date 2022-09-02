package starter;

import UI.FirstPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static UI.FirstPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingresar implements Task {
    private final String correo;
    private final String contrasena;

    public Ingresar(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public static Performable llenarCamposCorreoYContrasena(String correo, String contrasena) {

        return instrumented(Ingresar.class, correo,contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(correo).into(USERNAME_FIELD),
                Enter.theValue(contrasena).into(PASSWORD_FIELD),
                Click.on(SIGNIN_BTN)
        );

    }
}
