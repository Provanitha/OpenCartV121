package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DashBoradPage;
import pages.DemoQaLoginPage;
import pages.HomePage;

public class LoginTC1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\PageObjectModel\\driver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	
	//Creating object of home page
	HomePage home = new HomePage(driver);
	
	//Creating object of Login page
	DemoQaLoginPage login = new DemoQaLoginPage(driver);
	
	//Creating object of Dashboard
	DashBoradPage dashboard = new DashBoradPage(driver);
	
	//Click on Login button
	home.clickLogin();
	
	//Enter username & password
	login.enterUsername("---Your Username---");
	login.enterPassword("---Your Password---");
	
	//Click on login button
	login.clickLogin();
	//Thread.sleep(3000);
	
	
	//Capture the page heading and print on console
	System.out.println("The page heading is --- " +dashboard.getHeading());
	
	//Click on Logout button
	dashboard.clickLogout();

           //Close browser instance
           driver.quit();

  }

}