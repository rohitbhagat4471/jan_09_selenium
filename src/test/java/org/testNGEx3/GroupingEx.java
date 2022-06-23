package org.testNGEx3;

import org.testng.annotations.Test;

public class GroupingEx {
@Test(groups= {"smoke","regression","UAT"})
	public void test1() {
		System.out.println("test1");
	}
@Test(groups= {"smoke","UAT"})
public void test2() {
	System.out.println("test2");
}
@Test(groups= {"regression","UAT"})
public void test3() {
	System.out.println("test3");
}
@Test(groups= {"smoke","regression"})
public void test4() {
	System.out.println("test4");
}
@Test(groups= {"smoke"})
public void test5() {
	System.out.println("test5");
}
@Test(groups= {"regression"})
public void test6() {
	System.out.println("test6");
}
@Test(groups= {"UAT"})
public void test7() {
	System.out.println("test7");
}
@Test
public void test8() {
	System.out.println("test8");
}
}
