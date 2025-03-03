package testng;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
public ExtentSparkReporter sparkReporter;
public ExtentReports extent;
public ExtentTest test;


public void onStart(ITestContext context) {
	sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir") + "/extentreports/extnrepts.html");
	
	sparkReporter.config().setDocumentTitle("Automation");
	sparkReporter.config().setReportName("Functional");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent= new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Device-name", "Laptop");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("Tester_name", "vanitha");
	extent.setSystemInfo("OS", "Windows11");
	extent.setSystemInfo("Browser_name", "Chrome");
	
}

public void onTestSuccess(ITestResult result) {
	test= extent.createTest(result.getName()); // create new entry in the report
	test.log(Status.PASS, "test case passed is:" + result.getName());
}
public void onTestFailure(ITestResult result) {
	test= extent.createTest(result.getName()); // create new entry in the report
	test.log(Status.PASS, "test case passed is:" + result.getName());
	test.log(Status.PASS, "test case passed is:" + result.getThrowable());
}
public void onTestSkipped(ITestResult result) {
	test= extent.createTest(result.getName()); // create new entry in the report
	test.log(Status.PASS, "test case passed is:" + result.getName());
}
public void onFinish(ITestContext context) {
	extent.flush();
}




}
