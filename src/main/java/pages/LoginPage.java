package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.*;

import com.aventstack.extentreports.Status;

import base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement userTextBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passTextBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String loginToApplication()throws Exception
	{
		logger=report.createTest("Login To Sauce Lab Application");
		userTextBox.sendKeys(ReadData.readPropertyFile("Username"));
		logger.log(Status.INFO,"Username is Entered");
		passTextBox.sendKeys(ReadData.readPropertyFile("Password"));
		logger.log(Status.INFO,"Password is Entered");
		loginBtn.click();
		logger.log(Status.INFO,"Login Button Is Clicked");
		
		//logger.log(Status.PASS,"Login is Successful");
		
		return(driver.getCurrentUrl());
	}
	public String loginToApplicationWithMultipleData(String un,String pass)throws Exception
	{
		logger=report.createTest("Login To Sauce Lab Application");
		userTextBox.sendKeys(un);
		logger.log(Status.INFO,"Username is Entered");
		passTextBox.sendKeys(pass);
		logger.log(Status.INFO,"Password is Entered");
		loginBtn.click();
		logger.log(Status.INFO,"Login Button Is Clicked");
		logger.log(Status.PASS,"Login is Successful");
		
		return(driver.getCurrentUrl());
	}
	public String verifyTitleOfApplication()
	{
		return driver.getTitle();
	}
	public String verifyURLOfApplication()
	{
		return driver.getCurrentUrl();
	}
	
	

}
