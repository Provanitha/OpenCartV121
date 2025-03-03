package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name ="LoginData")
	public String [][] getData() throws IOException{
		
		//String path= ".\\testData\\Opencart_logindetails.xlsx";
		String path="C:\\Users\\vanitha.d\\eclipse-workspace\\OpenCartV121\\testData\\Opencart_logindetails.xlsx";
		
		ExcelUtils xlutil= new ExcelUtils(path);
		
		int totalrows= xlutil.getRowCount("Sheet1",0);
		int totalcols= xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][]=new String[totalrows][totalcols];
		for (int r=1; r<=totalrows; r++) {
			for(int c=0; c<totalcols; c++) {
				logindata[r-1][c]=xlutil.getCellData("Sheet1", r, c);
			}
		}
		return logindata;
		
	}

}
