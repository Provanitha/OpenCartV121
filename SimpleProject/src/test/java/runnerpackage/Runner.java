package runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/src/test/java/features/DemoqaLogin.feature",
		glue= "stepDefinition"
//		dryRun=true,
//		monochrome=true
	)

public class Runner {

	

}
