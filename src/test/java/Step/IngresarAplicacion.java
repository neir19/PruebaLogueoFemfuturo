package Step;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import starter.Ingresar;
import starter.PaginaOpen;
import starter.Salir;
import starter.Vea;

@RunWith(SerenityRunner.class)
public class IngresarAplicacion {
    public static final String correo = "71785796";
    public static final String contrasena = "71785796";


    Actor actor;

    @Managed(driver = "chrome")
    WebDriver driver;


    @Dado("^El usuario abra la pagina$")
    public void iniciar_navegador() {
        actor = Actor.named("Arbey");
        actor.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
        actor.has(PaginaOpen.abrir());
    }

    @Cuando("^el usuario ingrese sus datos$")
    public void IngresarPagina() {

        actor.has(Ingresar.llenarCamposCorreoYContrasena(correo, contrasena));
    }

    @Entonces("^deberia ver el subitulo$")
    public void mirar() {
        actor.has(Vea.ingresoBien());
    }


    @Entonces("^deberia poder desloguearse$")
    public void deslogueo() {
        actor.has(Salir.cerrar());
    }
}