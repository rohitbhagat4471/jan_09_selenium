package org.testNGEx1;

import org.testng.annotations.Test;

public class PriorityEx {
  @Test (priority=1)
  public void login() {
	  System.out.println("login");
  }
  @Test(priority=6)
  public void logout() {
	  System.out.println("logout");
  }
  @Test(priority=2)
  public void createcust() {
	  System.out.println("small createcust");
  }
  @Test(priority=3)
  public void Createcust() {
	  System.out.println("capital Createcust");
  }
  @Test(priority=5)
  public void updatecust() {
	  System.out.println("small Createcust");
  }
  @Test(priority=4)
  public void Updatecust() {
	  System.out.println("capital Updatecust");
  }
}
