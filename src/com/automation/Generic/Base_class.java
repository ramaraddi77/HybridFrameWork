package com.automation.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.automation.pom.POM_login_logout;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_class implements Framework_constants
{
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest test;
	public static WebDriver driver;
	public static POM_login_logout pmc;

	@BeforeTest
	public void reports()
	{
		reporter=new ExtentHtmlReporter(Extent_reports);
		reports= new ExtentReports();
		reports.attachReporter(reporter);
		test = reports.createTest("ExtentReportsForDWS");
	}
	@AfterTest
	public void flush()
	{
		reports.flush();
	}

	@BeforeClass
	public void openbrowser()
	{
		System.setProperty(key,value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeapp()
	{
		driver.quit();
	}

	@BeforeMethod
	public void loginDWS()
	{
		driver.get(propertyfileclass.propertyfile("URL"));
		pmc=new POM_login_logout(driver);
		pmc.loginLink().click();
		pmc.userName().sendKeys(UN);
		pmc.passWord().sendKeys(propertyfileclass.propertyfile("PASS"));
		pmc.loginButton().click();

	}
	@AfterMethod
	public void logout()
	{
		pmc.logOutLink().click();
	}
}



