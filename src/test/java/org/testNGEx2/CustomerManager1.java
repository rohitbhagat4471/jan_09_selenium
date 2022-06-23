package org.testNGEx2;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class CustomerManager1 {
	@BeforeClass
	public void getCustomerTestData() {
		System.out.println("get Customer test data");
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
		System.out.println("update Customer");
	}
	@AfterClass
	public void flushTestDataObject() {
		System.out.println("clear Customer test data object");
	}

}
