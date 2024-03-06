package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.Generic.Base_Test_constructor_chaining;

public class POM_login_logout extends Base_Test_constructor_chaining
{
	@FindBy(xpath = "//a[contains(text(),' in')]")
	private WebElement login_link;
	
	@FindBy(id ="Email")
	private WebElement user_name;
	
	@FindBy(id = "Password")
	private WebElement pass_word;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement login_btn;
	
	@FindBy(xpath = "//a[contains(text(),' out')]")
	private WebElement logout_link;
	
	public POM_login_logout(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement loginLink()
	{
		return login_link;
	}
	public WebElement userName()
	{
		return user_name;
	}
	public WebElement passWord()
	{
		return pass_word;
	}
	public WebElement loginButton()
	{
		return login_btn;
	}
	public WebElement logOutLink()
	{
		return logout_link;
	}
}

