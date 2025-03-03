package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src//test//java//Features//Login.feature",
glue= {"stepDefinitions"},
//dryRun=false,
monochrome =true,
plugin= {"pretty", "html:target/HtmlReports"}
)
public class TestRunner {

}
