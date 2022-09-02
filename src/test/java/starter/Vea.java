package starter;

import Questions.SIgnInQuestion;
import UI.SecondPage;
import io.cucumber.java.tr.Ve;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class Vea implements Task {

    public static Performable ingresoBien() {
        return instrumented(Vea.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat((SIgnInQuestion.is() ), equalTo("ARBEY HIGUITA H.")));

    }
}
