package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger; //log4j
import org.apache.logging.log4j.LogManager; //log4j

public class BaseClass {
	// achieve reusability // no code duplication
	public Logger logger;
	public static WebDriver driver;
	// loading config.properties
	public Properties p;
	
	
	
	@BeforeClass(groups= {"Sanity", "Regression", "Master"})
	@Parameters({"os","browser"})
	public void setUp(String os, String br) throws IOException {
		
		FileReader file= new FileReader("./src//test//resources//config.properties");
		p= new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass()); // LOG4J2
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	     {
			DesiredCapabilities cap = new DesiredCapabilities();
			//os
			if(os.equalsIgnoreCase("windows")) {
				cap.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac")) {
				cap.setPlatform(Platform.MAC);
			}else {
				System.out.println("no matching found");
				return;
			}
			
			// browser
			switch(br.toLowerCase()) {
			case "chrome":cap.setBrowserName("chrome");
			break;
			case "edge":cap.setBrowserName("MicrosoftEdge");
			break;
			default: System.out.println("no matching browser");
			   return;
			}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/host"), cap);
	     
	     }
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
		
       switch(br.toLowerCase()) {
		case "chrome": driver= new ChromeDriver();
		break;
		case "edge": driver= new EdgeDriver();
		break;
		case "firefox": driver= new FirefoxDriver();
		break;
		default: System.out.println("Invalid browser name....");
		return;
   }
		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appURL")); // reading url from properties file
		driver.manage().window().maximize();
	}
	
	@AfterClass (groups= {"Sanity", "Regression", "Master"})
	public void teaDown() {
		driver.close();
	}
	
	public String randomString() {
		
		String genearateRandom=	RandomStringUtils.randomAlphabetic(5);
			return genearateRandom;
			
		}
		
		public String randomNumeric() {
			
			String genearateRandomNumber =	RandomStringUtils.randomNumeric(10);
				return genearateRandomNumber;
	}
	public String randomAlphaNumeric() {
			
			String genearateRandomAlphaNumeric =	RandomStringUtils.randomAlphabetic(8);
			String genearateRandomNumber =	RandomStringUtils.randomNumeric(3);
				return (genearateRandomAlphaNumeric+" @ "+genearateRandomNumber);			
	}
	
	public String captureScreen(String tname) throws IOException{
		
		String timestamp= new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		
		String targetedfilepath= System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timestamp + ".png";
		
		File targetfile= new File(targetedfilepath);
		sourcefile.renameTo(targetfile);
		return targetedfilepath;
		
	}
}
