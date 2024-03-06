package com.automation.Generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_class extends Base_class implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is pass");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case is fail:"+result.getName());
		
		Screenshot_class.screenshot(this.driver, result);
		
		
	}

}
