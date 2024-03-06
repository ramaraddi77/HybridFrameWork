package com.automation.Generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_class1 extends Base_class implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is pass");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is fail "+ result.getName());
		Screenshot_class.screenshot(this.driver, result);
		
	}

}
