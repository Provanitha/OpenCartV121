package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssVSsoftAss {
	
//	@Test
//	void testHardAssertion() {
//		System.out.println("testing--");
//		System.out.println("inprogress--");
//		
//		Assert.assertEquals(1,2);
//		
//		System.out.println("done--");
//		System.out.println("delivered----");
		
	//}
	
	@Test
	void testSoftAssertion() {
		System.out.println("testing--");
		System.out.println("inprogress--");
		
	SoftAssert sf= new SoftAssert();
	sf.assertEquals(1, 2);
		
		System.out.println("done--");
		System.out.println("delivered----");
		
		sf.assertAll();
	}

}
