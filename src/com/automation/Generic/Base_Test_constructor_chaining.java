package com.automation.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Test_constructor_chaining 
{
	public Base_Test_constructor_chaining(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
