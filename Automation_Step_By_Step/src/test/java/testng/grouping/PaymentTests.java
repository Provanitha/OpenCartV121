package testng.grouping;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1, groups= {"sanity","regression", "functional"})
	void paymentinRupees() {
		System.out.println("payment in rupees...");
	}
	
	@Test(priority=1, groups= {"sanity","regression", "functional"})
	void paymentinDollors() {
		System.out.println("payment in dollors...");
	}
	
}
