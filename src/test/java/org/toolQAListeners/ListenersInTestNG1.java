package org.toolQAListeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersInTestNG1 implements ITestListener {
	
public void onTestStart(ITestResult result) {
	System.out.println("on test start:"+result.getName());
	Reporter.log("on test start:"+result.getName());
}
public void onTestSuccess(ITestResult result) {
	System.out.println("on test Success:"+result.getName());
	Reporter.log("on test Success:"+result.getName());

}
public void onTestFailure(ITestResult result) {
	System.out.println("on test Failure:"+result.getName());
	Reporter.log("on test Failure:"+result.getName());

}
public void onTestSkipped(ITestResult result) {
	System.out.println("on test Skipped:"+result.getName());
	Reporter.log("on test Skipped:"+result.getName());

}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("on test Skipped:"+result.getName());
	Reporter.log("on test Skipped:"+result.getName());

}
public void onStart(ITestContext conext) {
	System.out.println("** On Start **");
	Reporter.log("** On Start **");

}
public void onFinish(ITestContext conext) {
	System.out.println("** On Finish **");
	Reporter.log("** On Finish **");

}

}
