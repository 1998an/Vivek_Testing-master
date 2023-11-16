package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class LoginPageTest extends LoginPage
{
	LoginPage login;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
	}

	@Test(enabled = true, groups={"regression"})
	public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String expTitle=ReadData.readExcelLogin(1,1);//(1,1)
		String actTitle=login.verifyTitleOfApplication();
		AssertJUnit.assertEquals(expTitle, actTitle);
		Reporter.log("Verfied Title"+ actTitle);
	}
	
	@Test(enabled = true, groups={"sanity"})
	public void verifyURLOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String expURL=ReadData.readExcelLogin(1,0);//(1,0)
		String actURL=login.verifyURLOfApplication();
		AssertJUnit.assertEquals(expURL, actURL);
		Reporter.log("Verfied URL"+ actURL);
	}
	
	@Test(enabled = true, groups={"retest", "sanity"})
	public void loginToApplicationTest() throws Exception
	{
		String expURL=ReadData.readExcelLogin(1,2);//(1,2)
		String actURL=login.loginToApplication();
		AssertJUnit.assertEquals(expURL, actURL);
		logger=report.createTest("Login Button Click");
		if(expURL.equalsIgnoreCase(actURL))
		{
			logger.log(Status.PASS, "Login is Successful");
		}
		else
		{
			logger.log(Status.FAIL, "Login is UnSuccessful");
		}
		Reporter.log("Url after Login "+ actURL);
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult it)throws Exception
	{
		if(it.FAILURE==it.getStatus())
		{
			CaptureScreenShot.screenShot(it.getName());
		}
		report.flush();
		driver.close();
		
	}

}
