package co.com.choucair.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairFillFormPage {
    public static final Target INPUT_FIRST_NAME = Target.the("Textbox to write First Name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Textbox to write Last Name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Textbox to write email").located(By.id("email"));
    public static final Target INPUT_MONTH_BIRTH = Target.the("we choose the month birth name").located(By.id("birthMonth"));
    public static final Target INPUT_DAY_BIRTH = Target.the("we write the day birth name").located(By.id("birthDay"));
    public static final Target INPUT_YEAR_BIRTH = Target.the("we choose the year birth name").located(By.id("birthYear"));
    public static final Target NEXT_FORM_BUTTON = Target.the("button that show up the next step of the form to sign up").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]/span[1]"));
    public static final Target INPUT_ZIP = Target.the("we write the ZIP code").located(By.id("zip"));
    public static final Target NEXT_FORM_BUTTON2 = Target.the("button that show up the next step of the form to sign up").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]/span[1]"));
    public static final Target MOBILE_DEVICE = Target.the("we choose Mobile device").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target MODEL_MOBILE_DEVICE = Target.the("we choose Mobile mode device").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target OS_SYSTEM_MOBILE_DEVICE = Target.the("we choose Mobile OS system device").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target ALCATEL_OPTION = Target.the("Choose Alcatel Option").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[4]/span[1]/div[1]"));
    public static final Target CRYSTAL_OPTION = Target.the("Choose Crystal Option ").located(By.id("ui-select-choices-row-7-2"));
    public static final Target ANDROID_OPTION = Target.the("Choose Android version option").located(By.id("ui-select-choices-row-8-2"));
    public static final Target NEXT_FORM_BUTTON3 = Target.the("Button to move to the final part of the form").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));
    public static final Target INPUT_PASSWORD = Target.the("fill password form").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("fill Confirm password form").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("check the checkbox of terms").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target CHECKBOX_PRIVACY= Target.the("check the checkbox of privacy").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
}
