package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class Checkout1 extends TestBase
{
	@FindBy(xpath="//span[@class='title']")private WebElement checkoutTitle;			
	@FindBy(xpath="	//input[@id='first-name']")private WebElement firstName;	
	@FindBy(xpath="//input[@id='last-name']")private WebElement lastName;
	@FindBy(xpath="//input[@id='postal-code']")private WebElement zipcode;	
	@FindBy(xpath="//input[@id='continue']")private WebElement submit;	
	@FindBy(xpath="//button[@id='cancel']")	private WebElement cancel;
	public Checkout1()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyURLOfCheckout1()
	{
		return driver.getCurrentUrl();
	}
	public String verifyTitleOfCheckout1()
	{
		return checkoutTitle.getText();
	}
	public String verifyCheckout1() throws EncryptedDocumentException, IOException
	{
		firstName.sendKeys(ReadData.readExcelCheckout1(1,2));
		lastName.sendKeys(ReadData.readExcelCheckout1(1,3));
		zipcode.sendKeys(ReadData.readExcelCheckout1(1,4));
		submit.click();
		return(driver.getCurrentUrl());
	}
	public String verifyCancelCheckout1()
	{
		cancel.click();
		return(driver.getCurrentUrl());
	}
	
}
