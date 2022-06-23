package org.testNGEx2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerManager2 {
	@BeforeTest
	public void getQaEnvironmnetData() {
		System.out.println("get QA env test data");
	}
	@Test
	public void createCustomer () {
		System.out.println("create Customer");
	}
	@Test
	public void updateCustomer() {
		System.out.println("upadte Customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("delete Customer");
	}
	@AfterTest
	public void flushTestDataObject() {
		System.out.println("clear QA Env test data object");
	}

}
