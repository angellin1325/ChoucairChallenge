package co.com.choucair.challenge.tasks;

import co.com.choucair.challenge.userinterface.ChoucairFinishSignUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinishSignUp implements Task {
    public static FinishSignUp onThePage() {
        return Tasks.instrumented(FinishSignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairFinishSignUp.COMPLETE_SETUP_BUTTON));
    }
}
