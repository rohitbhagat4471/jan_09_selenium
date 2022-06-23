package org.assertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
	@Test
	public void HardAssertEx() {
		System.out.println("hard assert");
		int a=10;
		Assert.assertEquals(a, 11);//If assert fail it will not execute further program
		System.out.println("after int");
		String actstr= "pune";
		String expstr="pune";
		Assert.assertEquals(actstr, expstr);
		System.out.println("after string");
	}
	@Test
public void testMethod() {
	System.out.println("test Method");
}
}
