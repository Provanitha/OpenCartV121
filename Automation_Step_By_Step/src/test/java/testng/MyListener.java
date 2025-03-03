package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener  {
	  public void onStart(ITestContext context) {
		   System.out.println("Test execution started..........");
		   // execute only once before starting  all tc's
		  }
	 public void onTestStart(ITestResult result) {
		  System.out.println("test started..........");
		  // execute multiple times, execute evry test method
		  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("test passed......");
		  }
	 public void onTestFailure(ITestResult result) {
		 System.out.println("test failed......");
		  }
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("test skipped......");
		  }
	 public void onFinish(ITestContext context) {
		 // execute only once
		    // once finished the all the tc's		  
		
		 System.out.println("test execution completed......");

}
}