package org.assertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionEx1 {
	@Test
	public void SoftAssert() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Soft Assert");
		int a=10;
		sa.assertEquals(a, 11);
		System.out.println("after int");
		String actstr= "pune";
		String expstr="pune";
		sa.assertEquals(actstr, expstr);
		System.out.println("after string");
		boolean flg= true;
		sa.assertTrue(flg);
		System.out.println("after boolean");
		sa.assertTrue(actstr.equals("mumbai"));
		sa.assertFalse(actstr.equals("mumbai"));
		sa.assertAll();
	}
	@Test
public void testMethod() {
	System.out.println("test Method");
}
}
