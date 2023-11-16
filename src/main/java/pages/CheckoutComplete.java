package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutComplete extends TestBase
{
	@FindBy(xpath="//span[@class='title']")private WebElement check3Title;
	@FindBy(xpath="//img[@class='pony_express']")private WebElement imgLogo;      
	@FindBy(xpath="//h2[@class='complete-header']")private WebElement header;		
	@FindBy(xpath="//div[@class='complete-text']")private WebElement headerText;		
	@FindBy(xpath="//button[@id='back-to-products']")private WebElement backHomeButton;

	public CheckoutComplete()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLOfCheckoutComplete()
	{
		return driver.getCurrentUrl();
	}
	public String verifyTitleOfCheckoutComplete()
	{
		return check3Title.getText();
	}
	
	public boolean verifyImage()
	{
		return imgLogo.isDisplayed();
	}
	
	public String verifyHeader()
	{
		return header.getText();
	}
	public String verifyHeaderText()
	{
		return headerText.getText();
	}
	
	public String verifybackHome()
	{
		backHomeButton.click();
		return driver.getCurrentUrl();
	}
}
