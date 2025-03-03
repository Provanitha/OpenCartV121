package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name = "TestData")
	public Object[][] createData(){
		return new Object[][] {
			{"data", 1},
			{"data1", 2},
			{"data2", 3}
			
		};
		
	
	}
	
	@Test(dataProvider= "TestData")
	public void testMethod(String param1, int param2) {
		System.out.println("test method execute with:" + param1 +" , "+ param2 );
	}

}
