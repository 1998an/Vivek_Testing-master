package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.Checkout1;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class Checkout1Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	CartPage cart;
	Checkout1 check1;
	
	
	@BeforeMethod
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new CartPage();
		check1=new Checkout1();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartClick();
		
	}
	
	@Test
	public void verifyURLOfCheckout1Test()throws Exception
	{
		cart.verifyCheckout();
		String exp=ReadData.readExcelCheckout1(1,0); //urlcheckout1
		String act=check1.verifyURLOfCheckout1();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL of Chcekout 1 "+ act);
	}
	
	@Test
	public void verifyTitleOfCheckout1Test()throws Exception
	{
		cart.verifyCheckout();
		String exp=ReadData.readExcelCheckout1(1,1); //Title
		String act=check1.verifyTitleOfCheckout1();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Title of Checkout1 "+ act);
	}
	@Test
	public void verifyCheckout1Test()throws Exception
	{
		cart.verifyCheckout();
		String exp=ReadData.readExcelCheckout1(1,6); //sendkeys name
		String act=check1.verifyCheckout1();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL after Clicking Continue Button "+ act);
	}
	@Test
	public void verifyCancelCheckout1Test()throws Exception
	{
		cart.verifyCheckout();
		String exp=ReadData.readExcelCheckout1(1,5); //cancel
		String act=check1.verifyCancelCheckout1();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL after Cancel Button "+ act);
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
