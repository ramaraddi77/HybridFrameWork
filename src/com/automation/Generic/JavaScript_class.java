package com.automation.Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_class extends Base_class
{
	public static  JavascriptExecutor typeCast()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	
	public static void scroll_Down_Using_address(WebElement ele)
	{
		typeCast().executeScript("arguments[0].scrollIntoView();",ele);
		
	}
	
	public static void scroll_Down_Using_loc(int x,int y)
	{
		typeCast().executeScript("window.scrollBy("+x+","+y+")");
	}
}
