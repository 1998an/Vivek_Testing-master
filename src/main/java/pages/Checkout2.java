package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Checkout2 extends TestBase
{
	@FindBy(xpath="//span[@class='title']") private WebElement checkoutTitle2;
	@FindBy(xpath="(//div[@class='summary_info_label'])[1]")private WebElement paymentInfo;
	@FindBy(xpath="(//div[@class='summary_value_label'])[1]")private WebElement value1;
	
	@FindBy(xpath="(//div[@class='summary_info_label'])[2]")private WebElement shipping;
	@FindBy(xpath="(//div[@class='summary_value_label'])[2]")private WebElement value2;
	
	@FindBy(xpath="(//div[@class='summary_info_label'])[3]")private WebElement pricetotal;
	@FindBy(xpath="//div[@class='summary_subtotal_label']")private WebElement itemTotal;
	@FindBy(xpath="//div[text()='Item total: $']")private WebElement itemValue;
	@FindBy(xpath="//div[@class='summary_tax_label']")private WebElement taxValue;
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")private WebElement totalLabel;
	

	@FindBy(xpath="//button[@id='finish']")private WebElement finishButton;
	@FindBy(xpath="//button[@id='cancel']")private WebElement cancelButton;
	
	public Checkout2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLOfCheckout2()
	{
		return driver.getCurrentUrl();
	}
	public String verifyTitleOfCheckout2()
	{
		return checkoutTitle2.getText();
	}
	public String verifyPaymentInfo()
	{
		paymentInfo.getText();
		return value1.getText();
	}
	public String verifyShipping()
	{
		shipping.getText();
		return value2.getText();
	}
	public String verifyPriceTotal()
	{
		itemTotal.getText();
		itemValue.getText();
		totalLabel.getText();
		return pricetotal.getText();
		
	}
	
	public String verifyFinishButton()
	{
		finishButton.click();
		return driver.getCurrentUrl();
	}
	public String verifyCancelButton()
	{
		cancelButton.click();
		return driver.getCurrentUrl();
	}
}
