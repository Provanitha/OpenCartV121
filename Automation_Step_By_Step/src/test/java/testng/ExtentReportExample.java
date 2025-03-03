package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class ExtentReportExample {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
//	@BeforeTest
//	 public void setup() {
//		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReporter.html");
//		htmlReporter.config().setTheme(Theme.STANDARD);
//		htmlReporter.config().setDocumentTitle("Automation Report");
//		htmlReporter.config().setReportName("Selenium Extent Report");
//	
//	  extent = new ExtentReports();
//      extent.attachReporter(htmlReporter);
//
//      // WebDriver setup
//      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//      driver = new ChromeDriver();
//}
//
//  @Test
//  public void searchTest() {
//      // Start a new test in the report
//      test = extent.createTest("Google Search Test", "Test to validate Google search functionality");
//
//      try {
//          // Open Google
//          driver.get("https://www.google.com");
//          test.log(Status.PASS, "Navigated to Google");
//
//          // Perform search
//          driver.findElement(By.name("q")).sendKeys("Selenium Extent Reports");
//          driver.findElement(By.name("q")).submit();
//          test.log(Status.PASS, "Performed search for 'Selenium Extent Reports'");
//
//          // Validate title
//          String title = driver.getTitle();
//          if (title.contains("Selenium Extent Reports")) {
//              test.log(Status.PASS, "Title contains 'Selenium Extent Reports'");
//          } else {
//              test.log(Status.FAIL, "Title does not contain 'Selenium Extent Reports'");
//          }
//      } catch (Exception e) {
//          test.log(Status.FAIL, "Test failed due to exception: " + e.getMessage());
//      }
//  }
//
//  @AfterTest
//  public void tearDown() {
//      // Close the browser
//      driver.quit();
//
//      // Flush the report (write everything to the file)
//      extent.flush();
//  }
//}
	//================================================================
	
	
	    @BeforeTest
	    public void setup() {
	        // Create an instance of ExtentSparkReporter
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
	        sparkReporter.config().setTheme(Theme.STANDARD);
	        sparkReporter.config().setDocumentTitle("Automation Report");
	        sparkReporter.config().setReportName("Selenium Extent Report");

	        extent = new ExtentReports();
	        extent.attachReporter(sparkReporter);

	        // WebDriver setup
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }

	    @Test
	    public void searchTest() {
	        test = extent.createTest("Google Search Test", "Test to validate Google search functionality");

	        try {
	            driver.get("https://www.google.com");
	            test.log(Status.PASS, "Navigated to Google");

	            driver.findElement(By.name("q")).sendKeys("Selenium Extent Reports");
	            driver.findElement(By.name("q")).submit();
	            test.log(Status.PASS, "Performed search for 'Selenium Extent Reports'");

	            String title = driver.getTitle();
	            if (title.contains("Selenium Extent Reports")) {
	                test.log(Status.PASS, "Title contains 'Selenium Extent Reports'");
	            } else {
	                test.log(Status.FAIL, "Title does not contain 'Selenium Extent Reports'");
	            }
	        } catch (Exception e) {
	            test.log(Status.FAIL, "Test failed due to exception: " + e.getMessage());
	        }
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	        extent.flush();
	    }}


