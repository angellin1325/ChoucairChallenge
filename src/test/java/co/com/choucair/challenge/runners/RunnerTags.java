package co.com.choucair.challenge.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/challengeChoucair.feature",
        tags = "@stories",
        glue = "co.com.choucair.challenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}

