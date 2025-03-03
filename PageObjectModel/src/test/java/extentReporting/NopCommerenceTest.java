//package extentReporting;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class NopCommerenceTest {
//	
//	public WebDriver driver;
//	
//	public ExtentHtmlReporter htmlReporter;
//	public ExtentReports extent;
//	public ExtentTest test;
//	
//	@BeforeTest
//	
//	public void setExtent() {
//		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
//		htmlReporter.config().setDocumentTitle("Automation Report");
//		htmlReporter.config().setReportName("Functional Report");
//		htmlReporter.config().setTheme(Theme.DARK);
//		
//		extent= new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		extent.setSystemInfo("Hostname", "Localhost");
//		extent.setSystemInfo("OS", "Windows10");
//		extent.setSystemInfo("Tester name", "vanitha");
//		extent.setSystemInfo("Browser", "Chrome");
//	}
//	
//	@AfterTest
//	
//	public void endReport(){
//		extent.flush();
//	}
//	
//	@BeforeMethod
//	
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.nopcommerce.com/");
//	}
//	
//	@Test
//	
//	public void noCommerceTitleTest() {
//		
//		test= extent.createTest("nopCommerceTitleTest");
//		
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(true, "nopCommerce demo store");
//		
//	}
//	@Test
//	
//	public void noCommerceLogoTest() {
//		
//		test= extent.createTest("noCommerceLogoTest");
//		
//	Boolean status=	driver.findElement(By.xpath(" //@img[@alt='nopCommerce demo store']")).isDisplayed();
//	Assert.assertTrue(status);
//	}
//	
//	@Test
//	
//	public void noCommerceLoginTest() {
//		test=extent.createTest("noCommerceLoginTest");
//		
//		Assert.assertTrue(true);
//	}
//	
//	@AfterMethod
//	
//	public void tearDown(ITestResult result) throws IOException {
//		if(result.getStatus()==ITestResult.FAILURE) {
//			test.log(Status.FAIL, "TEST CASE FAILED IS:"+ result.getName());
//			test.log(Status.FAIL, "TEST CASE FAILED IS:"+ result.getThrowable());
//			
//			String screenshotPath= NopCommerenceTest.getScreenshot(driver ,result.getName());
//			test.addScreenCaptureFromPath(screenshotPath);
//			
//		}else if(result.getStatus()== ITestResult.SKIP) {
//			test.log(Status.SKIP, "TEST CASE IS SKIPPED" + result.getName());
//		}
//		else if(result.getStatus()== ITestResult.SUCCESS) {
//			test.log(Status.PASS, "TEST CASE IS SKIPPED" + result.getName());
//		}
//		}
//	
//	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
//		String dateName= new SimpleDateFormat("yyyyMMDDhhmmss").format(new Date());
//		TakeScreenshot ts= (TakeScreenshot) driver;
//		File source= ts.getScreenshotAS(OutputType.FILE);
//		
//		
//		String destination= System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
//		File finalDestination= new File(destination);
//		FileUtils.copyFile(source, finalDestination);
//		return destination;
//		
//	}
//
//}
//
