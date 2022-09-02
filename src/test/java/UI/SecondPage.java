package UI;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SecondPage {
    public static Target  subtitulo= Target.the("subititulo de ingrreso").located(By.xpath("//td[contains(text(),'ARBEY HIGUITA H.')]"));
    public static  Target salir_btn= Target.the("boton de salir").located(org.openqa.selenium.By.xpath("//tbody/tr[1]/td[1]/div[1]/center[1]/div[1]/div[7]"));
}
