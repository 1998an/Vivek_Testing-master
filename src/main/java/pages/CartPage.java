package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.*;


import base.TestBase;

public class CartPage extends TestBase
{
	@FindBy(xpath="//span[@class='title']") private WebElement cartTitle;
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutButton;
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueButton;
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleOfApplication()
	{
		return cartTitle.getText();
	}
	
	public void verifyContinue()
	{
		continueButton.click();
	}
	public void verifyCheckout()
	{
		checkoutButton.click();
	}
	
	
}
