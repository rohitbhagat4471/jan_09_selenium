package org.testNGEx1;

import org.testng.annotations.Test;

public class Ex2 {
  @Test
  public void testMethod1() {
	  System.out.println("testMethod1");
	  testMethod2();
  }
  
  public void testMethod2() {
	  System.out.println("testMethod2");
  }
  @Test
  public void testMethod3() {
	  System.out.println("testMethod3");
	  testMethod4();
  }
  
  public void testMethod4() {
	  System.out.println("testMethod4");
  }
}
