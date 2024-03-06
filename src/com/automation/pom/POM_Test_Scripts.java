package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.Generic.Base_Test_constructor_chaining;

public class POM_Test_Scripts extends Base_Test_constructor_chaining
{
	//Declaration;
	@FindBy(xpath = "//div[@class='header-menu']/ul/li[4]/a")
	private WebElement apparel_shoe;
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sort_drop;
	
	@FindBy(xpath = "//select[@id='products-pagesize']")
	private WebElement disp_drop;
	
	@FindBy(xpath = "//select[@id='products-viewmode']")
	private WebElement view_drop;
	
	@FindBy(xpath = "//a[text()='Blue Jeans']/../../div[3]/div/input")
	private WebElement blueJeans_addtocart;
	
	@FindBy(xpath = "//a[text()='Casual Golf Belt']/../../div[3]/div/input")
	private WebElement belt_addtocart;
	
	@FindBy(xpath = "//span[contains(text(),' cart')]")
	private WebElement shopping_link;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[1]/input")
	private WebElement cbox_bluejeans;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[1]/input")
	private WebElement cbox_belt;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr/td[6]/span[2]")
	private WebElement blue_jeans_tp;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
	private WebElement belt_tp;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement update_cart_btn;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement terms_cbox;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkout_btn;
	
	
	//Initialization
	public POM_Test_Scripts(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement apparel_shoes()
	{
		return apparel_shoe;
	}
	public WebElement sortDrop()
	{
		return sort_drop;
	}
	
	public WebElement dispDrop()
	{
		return disp_drop;
	}
	public WebElement viewDrop()
	{
		return view_drop;
	}
	public WebElement blueJeansCart()
	{
		return blueJeans_addtocart;
	}
	public WebElement casualBeltCart()
	{
		return belt_addtocart;
	}
	public WebElement shoppingCart()
	{
		return shopping_link;
	}
	public WebElement blueJeansCbox()
	{
		return cbox_bluejeans;
	}
	public WebElement BeltCbox()
	{
		return cbox_belt;
	}
	public WebElement JeansPrice()
	{
		return blue_jeans_tp;
	}
	public WebElement beltPrice()
	{
		return belt_tp;
	}
	public WebElement updateCartBtn()
	{
		return update_cart_btn;
	}
	public WebElement termsCbox()
	{
		return terms_cbox;
	}
	public WebElement checkOutBox()
	{
		return checkout_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
