package datadriventesting;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
List<WebElement> total_table=driver.findElements(By.xpath("//table[@class='dataTable']//tr//td"));
int total_count = total_table.size();
System.out.println("total data: " + total_count );

List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
int total_rows=rows.size();
System.out.println("no.of rows: " + total_rows);

List<WebElement> colmn=driver.findElements(By.xpath("//table[@class='dataTable']//td"));
int total_colm=colmn.size();
System.out.println("no.of colmns: " + total_colm);

// specific row/ cell

String value=driver.findElement(By.xpath("//table[@class='dataTable']//tr[2]//td[1]")).getText();
System.out.println("rows and cells: " +value);


// total data retrieving
//for(int r=1; r<=total_rows; r++) {
//	for(int c=1; c<=total_colm; c++) {
//		
//	String data=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td["+c+"]")).getText();
//	System.out.println(data + "    ");
    
	
	for(int r=1; r<=total_rows; r++) {
	
		String company=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td[1]")).getText();
		
		if(company.equals("Dewan Housing")) {
		
		String Group=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td[2]")).getText();
		String Prev_Close=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td[3]")).getText();
		String Current_Price=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td[4]")).getText();
		System.out.println(Group + "    "+ Prev_Close + "   "+  Current_Price);
	}
		
	}
	driver.quit();
}
}
