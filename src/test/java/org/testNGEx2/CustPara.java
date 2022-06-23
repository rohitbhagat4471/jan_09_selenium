package org.testNGEx2;

import org.testng.annotations.Test;

public class CustPara {
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
}
