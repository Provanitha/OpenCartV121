package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/Excelthroughlgncntials.feature",
glue= {"StepDefinitions"},
//dryRun=false,
monochrome = true)
//plugin = {"pretty", "html:target/HtmlReports",
//		            "json:target/JSONReports/reports.json",
//		            "junit:target/JUnitReports"})
//plugin = {"pretty", "json:target/JSONReports/reports.json"})
//plugin = {"pretty", "junit:target/JUnitReports/report.xml"},
//tags="@smoketest")

public class TestRunner {

}
