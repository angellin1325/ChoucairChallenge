package co.com.choucair.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairSignUpPage {
    public static final Target SIGNUP_BUTTON = Target.the("button that show us the form to sign up").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
