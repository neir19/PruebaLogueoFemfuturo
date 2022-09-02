package UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import javax.swing.plaf.PanelUI;

public class FirstPage {

    public static Target USERNAME_FIELD= Target.the("email field").located(By.id("usuario"));
    public static Target PASSWORD_FIELD= Target.the("password field").located(By.id("contrasena")) ;
    public static Target SIGNIN_BTN= Target.the("sign in button").located(By.id("boton-entrar"));
}
