package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class CartPageTest extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	CartPage cart;
	

	@BeforeMethod
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new CartPage();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartClick();
	}
	
	@Test
	public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelCart(1,0);//Cart(Sheet3,1,0);YourCart
		String act=cart.verifyTitleOfApplication();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL of Cart "+ act);
	}
	@Test
	public void verifyURLOfApplicationTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelCart(1,1);//Cart(Sheet3,1,1);Urlcart
		String act=cart.verifyURLOfApplication();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL of Cart "+ act);
	}
	@Test
	public void verifyContinueTest()
	{
		cart.verifyContinue();
		Reporter.log(driver.getCurrentUrl());
	}
	@Test
	public void verifyCheckoutTest()
	{
		cart.verifyCheckout();
		Reporter.log(driver.getCurrentUrl());
	}
	
	@AfterMethod
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
