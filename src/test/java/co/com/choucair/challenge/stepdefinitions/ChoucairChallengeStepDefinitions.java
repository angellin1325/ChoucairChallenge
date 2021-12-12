package co.com.choucair.challenge.stepdefinitions;
import co.com.choucair.challenge.tasks.FillForm;
import co.com.choucair.challenge.tasks.FinishSignUp;
import co.com.choucair.challenge.tasks.OpenUp;
import co.com.choucair.challenge.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
public class ChoucairChallengeStepDefinitions {

    @Before
    public void setStage (){OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Angel wants to enter Utest and press sign up$")
    public void thanAngelWantsToEnterUtestAndPressSignUp() {
        OnStage.theActorCalled("Angel").wasAbleTo(OpenUp.thePage(),(SignUp.onThePage()));
    }

    @When("^he fill all the forms required$")
    public void heFillAllTheFormsRequired() {
        OnStage.theActorCalled("Angel").wasAbleTo(FillForm.onTheForm());
    }

    @Then("^he will have a new user and log in already$")
    public void heWillHaveANewUserAndLogInAlready() {
        OnStage.theActorCalled("Angel").wasAbleTo(FinishSignUp.onThePage());
    }
}
