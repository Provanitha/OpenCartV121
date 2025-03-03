package testng;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class BeforeAndAfterclass {
	

	@BeforeClass
	void login() {
		System.out.println("login into app...");
	}
	
	@Test
	void search() {
		System.out.println("search ...");
	}
	@AfterClass
    void logout() {
    	System.out.println("logout app");
    }
    
	@Test
    void advsearch() {
    	
    	System.out.println("adv search...");
    	
    }
    

}
