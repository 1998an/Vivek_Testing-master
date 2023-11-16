package pages;

import java.util.List;
import utility.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class Inventory_Page extends TestBase
{
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement burger;
	@FindBy(xpath="//div[@class='app_logo']") private WebElement appLogo;
	@FindBy(xpath="//div[@class='shopping_cart_container']") private WebElement cartLink;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement cartBadge;

	@FindBy(xpath="//span[@class='title']") private WebElement labelProducts;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement sortTab;

	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") private WebElement product1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addToCart1;
	@FindBy(xpath="//div[@class='inventory_item_label']") private List<WebElement> productList;

	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement product2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement addToCart2;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") private WebElement removeToCart2;

	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']") private WebElement product3;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement addToCart3;

	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']") private WebElement product4;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement addToCart4;

	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") private WebElement product5;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-onesie']") private WebElement addToCart5;
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']") private WebElement removeToCart5;

	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") private WebElement product6;
	@FindBy(xpath="//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement addToCart6;

	@FindBy(xpath="//ul[@class='social']//li[@class='social_twitter']") private WebElement iconTwit;
	@FindBy(xpath="//ul[@class='social']//li[@class='social_facebook']") private WebElement iconFace;
	@FindBy(xpath="//ul[@class='social']//li[@class='social_linkedin']") private WebElement iconLinkdn;
	public Inventory_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyBurger()
	{
		//burger.click();
		return burger.isEnabled();
	}
	public String verifyappLogo()
	{
		return appLogo.getText();
	}
	public boolean verifyCartLink()
	{
		
		return cartLink.isDisplayed();
	}
	
	public String verifyProductsLabel()
	{
		return labelProducts.getText();
	}
	public boolean verifysortTab()
	{
		sortTab.click();
		return sortTab.isDisplayed();
		
	}
	
	public String verifyProduct1()
	{
		return product1.getText();
	}
	public boolean verifyAddToCart1()
	{
		//addToCart1.click();
		return addToCart1.isDisplayed();
	}
	
	public String verifyProduct2()
	{
		return product2.getText();
		
	}
	public boolean verifyAddToCart2()
	{
		//addToCart2.click();
		return addToCart2.isDisplayed();
	}
	
	public String verifyProduct3()
	{
		return product3.getText();
		
	}
	public boolean verifyAddToCart3()
	{
		//addToCart3.click();
		return addToCart3.isDisplayed();
	}
	
	public String verifyProduct4()
	{
		return product4.getText();
	}
	public boolean verifyAddToCart4()
	{
		//addToCart4.click();
		return addToCart4.isDisplayed();
	}
	
	public String verifyProduct5()
	{
		return product5.getText();
	}
	public boolean verifyAddToCart5()
	{
		//addToCart5.click();
		return addToCart5.isDisplayed();
	}
	
	public String verifyProduct6()
	{
		return product6.getText();
	}
	public boolean verifyAddToCart6()
	{
		//addToCart6.click();
		return addToCart6.isDisplayed();
	}
	
	public boolean verifyIconTwit()
	{
		return iconTwit.isDisplayed();
	}
	public boolean verifyIconFace()
	{
		return iconFace.isDisplayed();
	}
	public boolean verifyIconLinkdn()
	{
		return iconLinkdn.isDisplayed();
	}
	
	public int verifyCountProducts()
	{
		return productList.size();
	}
	
	public String add6Products()
	{
		//HandleDropdown handleDropdown=new HandleDropdown();
		HandleDropdown.handleSelectClass(sortTab, "Name (Z to A)");
		
		addToCart1.click();
		addToCart2.click();
		addToCart3.click();
		addToCart4.click();
		addToCart5.click();
		addToCart6.click();
		
		return cartBadge.getText();
	}
	
	public String remove2Products()
	{
		
		add6Products();
		removeToCart2.click();
		removeToCart5.click();
		
		return cartBadge.getText();
		
	}
	
	public void verifyCartClick()
	{
		cartLink.click();
	}

}
