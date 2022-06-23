package org.testNGEx2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManager2 {
	@BeforeTest
	public void getDevEnvironmentData() {
		System.out.println("get dev environment test data");
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
		System.out.println("delete account");
	}
	@AfterTest
	public void flushTestDataObject() {
		System.out.println("clear dev environment test data object");
	}

}
