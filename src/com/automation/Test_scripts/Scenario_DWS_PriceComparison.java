package com.automation.Test_scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.Generic.Base_class;
import com.automation.Generic.Conversion;
import com.automation.Generic.JavaScript_class;
import com.automation.Generic.Select_DropDown_Options;
import com.automation.pom.POM_Test_Scripts;
import com.aventstack.extentreports.Status;


@Listeners(com.automation.Generic.Listeners_class1.class)
public class Scenario_DWS_PriceComparison extends Base_class
{
	@Test
	public void ts() throws InterruptedException
	{
	POM_Test_Scripts pmc=new POM_Test_Scripts(driver);
	pmc.apparel_shoes().click();
	Thread.sleep(1500);
	
	test.log(Status.INFO,"Apparel&shoes tab are displayed");
	WebElement sortDrop = pmc.sortDrop();
	
	Select_DropDown_Options.select_By_Index(sortDrop, 1);
	Thread.sleep(3000);
	WebElement dispDrop = pmc.dispDrop();
	Select_DropDown_Options.select_By_Index(dispDrop, 2);
	Thread.sleep(3000);
	WebElement viewDrop = pmc.viewDrop();
	Select_DropDown_Options.select_By_VisibleText(viewDrop, "List");
	Thread.sleep(3000);
	
	
	JavaScript_class.scroll_Down_Using_address(pmc.blueJeansCart());
	Thread.sleep(2000);
	
	
	pmc.blueJeansCart().click();
	Thread.sleep(6000);
	pmc.casualBeltCart().click();
	Thread.sleep(2000);
	
	
	JavaScript_class.scroll_Down_Using_loc(0, -700);
	pmc.shoppingCart().click();
	Thread.sleep(3000);
	String jeans_price = pmc.JeansPrice().getText();
	Thread.sleep(2000);
	String belt_price = pmc.beltPrice().getText();
	Thread.sleep(2000);
	double Belt_converted = Conversion.convert(belt_price);
	Thread.sleep(2000);
	double Jeans_converted = Conversion.convert(jeans_price);
	
	if(Belt_converted>Jeans_converted)
	{
		test.log(Status.INFO,"Jeans is costly");
		pmc.blueJeansCbox().click();
		Thread.sleep(2000);
		pmc.updateCartBtn().click();
	}
	else if(Jeans_converted>Belt_converted)
	{
		test.log(Status.INFO,"belt is costly");
		Thread.sleep(1000);
		pmc.BeltCbox().click();
		Thread.sleep(2000);
		pmc.updateCartBtn().click();
	}
	else
	{
		test.log(Status.PASS, "Both are equal");
		pmc.termsCbox().click();
		Thread.sleep(2000);
		pmc.checkOutBox().click();
	}

	}
}
