package co.com.choucair.challenge.tasks;
import co.com.choucair.challenge.userinterface.ChoucairFillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class FillForm implements Task {

    public static FillForm onTheForm() {
        return Tasks.instrumented(FillForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Angel").into(ChoucairFillFormPage.INPUT_FIRST_NAME),
                Enter.theValue("Lin").into(ChoucairFillFormPage.INPUT_LAST_NAME),
                Enter.theValue("angel_lay27@hotmail.es").into(ChoucairFillFormPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("July").from(ChoucairFillFormPage.INPUT_MONTH_BIRTH),
                SelectFromOptions.byIndex(10).from(ChoucairFillFormPage.INPUT_DAY_BIRTH),
                SelectFromOptions.byVisibleText("1990").from(ChoucairFillFormPage.INPUT_YEAR_BIRTH),
                Click.on(ChoucairFillFormPage.NEXT_FORM_BUTTON),
                Enter.theValue("0000").into(ChoucairFillFormPage.INPUT_ZIP),
                Click.on(ChoucairFillFormPage.NEXT_FORM_BUTTON2),
                Click.on(ChoucairFillFormPage.MOBILE_DEVICE),
                Click.on(ChoucairFillFormPage.ALCATEL_OPTION),
                Click.on(ChoucairFillFormPage.MODEL_MOBILE_DEVICE),
                Click.on(ChoucairFillFormPage.CRYSTAL_OPTION),
                Click.on(ChoucairFillFormPage.OS_SYSTEM_MOBILE_DEVICE),
                Click.on(ChoucairFillFormPage.ANDROID_OPTION),
                Click.on(ChoucairFillFormPage.NEXT_FORM_BUTTON3),
                Enter.theValue("PrUeBa@204845").into(ChoucairFillFormPage.INPUT_PASSWORD),
                Enter.theValue("PrUeBa@204845").into(ChoucairFillFormPage.CONFIRM_PASSWORD),
                Click.on(ChoucairFillFormPage.CHECKBOX_TERMS),
                Click.on(ChoucairFillFormPage.CHECKBOX_PRIVACY)
        );


    }
}
