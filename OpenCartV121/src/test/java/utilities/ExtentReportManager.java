package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener{
	
	
public ExtentSparkReporter sparkReporter;
public ExtentReports extent;
public ExtentTest test;

String repName;

public void onStart(ITestContext testContext) {
	
/*	SimpleDateFormat df= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	Date dt= new Date();
	String cuurentdate= df.format(dt); */

	
	String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
	repName= "Test-Report-" + timeStamp + ".html";
	sparkReporter= new ExtentSparkReporter(".\\reports\\" + repName); // specify location
	
	//sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir") + "/extentreports/extnrepts.html");
	
	sparkReporter.config().setDocumentTitle("opencart Automation report ");
	sparkReporter.config().setReportName("opencart Functional Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent= new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("Application", "opencart");
	extent.setSystemInfo("Module", "Admin");
	extent.setSystemInfo("sub-module", "Customers");
	extent.setSystemInfo("User Name", System.getProperty("user.name"));
	extent.setSystemInfo("Environment", "QA");
	
	String os= testContext.getCurrentXmlTest().getParameter("os");
	extent.setSystemInfo("Operating System", os);
	
	String browser= testContext.getCurrentXmlTest().getParameter("browser");
	extent.setSystemInfo("Browser", browser);
	
	
	List<String> includedGroups =testContext.getCurrentXmlTest().getIncludedGroups();
	if(!includedGroups.isEmpty()) {
		extent.setSystemInfo("Groups", includedGroups.toString());
	}
	
}

public void onTestSuccess(ITestResult result) {
	test= extent.createTest(result.getTestClass().getName()); // create new entry in the report
	test.assignCategory(result.getMethod().getGroups());
	test.log(Status.PASS, result.getName() + "got successfully executed ");
}
public void onTestFailure(ITestResult result) {
	
	test= extent.createTest(result.getTestClass().getName()); // create new entry in the report
	test.assignCategory(result.getMethod().getGroups());
	
	test.log(Status.FAIL, result.getName() + "got failed");
	test.log(Status.INFO, result.getThrowable().getMessage());
	
	try {
		String imgpath= new BaseClass().captureScreen(result.getName());
		test.addScreenCaptureFromPath(imgpath);
	}catch(IOException e1) {
		e1.printStackTrace();
	}
	
}
public void onTestSkipped(ITestResult result) {
	test= extent.createTest(result.getTestClass().getName()); // create new entry in the report
	test.assignCategory(result.getMethod().getGroups());
	test.log(Status.SKIP,  result.getName() + " got skipped");
	test.log(Status.INFO, result.getThrowable().getMessage());
}

public void onFinish(ITestContext context) {
	extent.flush();
	 // it will show the reports in browser automatically , no need to open manually
	String pathOfExtentReport= System.getProperty("user.dir")+ "\\reports\\"+ repName;
	File extentReport= new File(pathOfExtentReport);
	
	try {
		Desktop.getDesktop().browse(extentReport.toURI());
	}catch(Exception e) {
		e.printStackTrace();
	}
}




}


