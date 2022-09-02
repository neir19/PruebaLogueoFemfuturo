package Questions;

import UI.SecondPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;


public class SIgnInQuestion implements Question<String> {

    public static SIgnInQuestion is() {
        return new SIgnInQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {

        System.out.println ("este es el subtitulo:" +" "+Text.of(SecondPage.subtitulo).answeredBy(actor));
        return Text.of(SecondPage.subtitulo).answeredBy(actor);
    }
}
