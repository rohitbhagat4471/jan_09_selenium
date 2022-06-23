package org.testNGEx3;

import org.testng.annotations.Test;

public class EnabledEx {
	@Test(priority=1,enabled=true)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=5,enabled= true)
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority=2)
	public void createCust() {
		System.out.println("createCust");
	}
	@Test(priority=3)
	public void updateCust() {
		System.out.println("updateCust");
	}
	@Test(priority=4,enabled=false)
	public void deleteCust() {
		System.out.println("deleteCust");
	}


}
