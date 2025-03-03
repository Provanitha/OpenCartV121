package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");


//String filepath=System.getProperty("user.dir")+"testdata\\caldata.xlsx";
String filepath=System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanitha.d\\eclipse-workspace\\Automation_Step_By_Step\\testdata\\ExcelData.xlsx");
Thread.sleep(3000);
int rows= ExcelUtils.getRowCount(filepath, "Sheet1");

for(int i=1;i<=rows;i++) {
	//1) read data from excel
	String Principle=ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
	String Rate_of_Interest=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
	String Period1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
	String Period2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
	String Frequency=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
	String exp_mvalue=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
	
	//2)pass above data into application
	
	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principle);
	driver.findElement(By.id("interest")).sendKeys(Rate_of_Interest);
	driver.findElement(By.id("tenure")).sendKeys(Period1);
	Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
	perdrp.selectByVisibleText(Period2);
	
	Select fredrp=new Select(driver.findElement(By.id("frequency")));
	fredrp.selectByVisibleText(Frequency);
	
	driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']")).click();
	
	// validation
	String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
	
	if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) {
		System.out.println("Test Passed");
		ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");
		ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
	}else 	
		System.out.println("Test Failed");
	ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");
	ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
	
}

driver.findElement(By.xpath("//a[@onclick='javascript:reset_fdcalcfrm();']")).click();
driver.quit();
	}
	


}
