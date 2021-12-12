package co.com.choucair.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairFinishSignUp {
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Last Button to finish setup").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]"));
}
