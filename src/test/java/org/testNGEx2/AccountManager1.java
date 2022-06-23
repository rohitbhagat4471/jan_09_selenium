package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AccountManager1 {
	@BeforeClass
	public void getAccountTestData() {
		System.out.println("get account test data");
	}
	@Test
	public void createAccount () {
		System.out.println("create account");
	}
	@Test
	public void updateAccount() {
		System.out.println("upadte account");
	}
	@Test
	public void deleteAccount() {
		System.out.println("update account");
	}
	@AfterClass
	public void flushTestDataObject() {
		System.out.println("clear account test data object");
	}

}
