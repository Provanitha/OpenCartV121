package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
public class ExcelSteps {

	 WebDriver driver;
	    String url;
	    String username;
	    String password;
		@Given("I read the URL and credentials from the Excel file")
		public void i_read_the_url_and_credentials_from_the_excel_file() {
			
			 // Path to your Excel file
	        String excelFilePath = "E:\\Automation testing\\ExcelLogin.xlsx";

	        try (FileInputStream file = new FileInputStream(excelFilePath);
	             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

	            // Read the first sheet in the Excel file
	            XSSFSheet sheet = workbook.getSheetAt(0);

	            // Read the first row (ignoring the header)
	            XSSFRow row = sheet.getRow(1);  // Get the second row (index 1) where the URL, username, and password are stored
	            url = row.getCell(1).getStringCellValue();       // Read the URL from the second column
	            username = row.getCell(2).getStringCellValue();  // Read the Username from the third column
	            password = row.getCell(3).getStringCellValue();  // Read the Password from the fourth column
	            
	            System.out.println("URL fetched from Excel: " + url);
	            System.out.println("Username fetched from Excel: " + username);
	            System.out.println("Password fetched from Excel: " + password);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		   

		@When("I launch the URL in browser")
		public void i_launch_the_url_in_browser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();

	        // Launch the URL from Excel
	        driver.get(url);
		}

		@And("I enter username and password")
		public void i_enter_username_and_password() throws InterruptedException {
			 driver.findElement(By.id("userName")).sendKeys(username);  // Enter the username
		        driver.findElement(By.id("password")).sendKeys(password);  // Enter the password
Thread.sleep(2000);
		        // Find the login button and click it
		        driver.findElement(By.xpath("//button[@id='login']")).click(); 
		}

		@Then("I should be logged in successfully")
		public void i_should_be_logged_in_successfully() {
//			 String expectedTitle = "Dashboard";  // Example title after login
//		        String actualTitle = driver.getTitle();
//		        
//		        if (actualTitle.equals(expectedTitle)) {
//		            System.out.println("Login successful! Navigated to the dashboard.");
//		        } else {
//		            System.out.println("Login failed! Current page title: " + actualTitle);
//		        }
			
			WebElement e= driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
			
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals(e)) {
				   System.out.println("Login successful! Navigated to the dashboard.");
	        } else {
	            System.out.println("Login failed! Current page title: ");	        }

		        // Close the browser
		        driver.quit();
		}

	}


