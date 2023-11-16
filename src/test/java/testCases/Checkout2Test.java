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
import pages.Checkout1;
import pages.Checkout2;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class Checkout2Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	CartPage cart;
	Checkout1 check1;
	Checkout2 check2;
	

	@BeforeMethod
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new CartPage();
		check1=new Checkout1();
		check2=new Checkout2();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartClick();
		cart.verifyCheckout();
		check1.verifyCheckout1();
	}
	
	@Test
	public void verifyURLOfCheckout2Test()throws Exception
	{
		String exp=ReadData.readExcelCheckout2(1,1); //urlcheckout2
		String act=check2.verifyURLOfCheckout2();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL of Chcekout 2 "+ act);
	}
	@Test
	public void verifyTitleOfCheckout2Test()throws Exception
	{
		String exp=ReadData.readExcelCheckout2(1,0); //Title
		String act=check2.verifyTitleOfCheckout2();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Title of Checkout 2 "+ act);
	}
	@Test
	public void verifyFinishButtonTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelCheckout2(1,3); //Finish(1,3)
		String act=check2.verifyFinishButton();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Finish Button "+ act);
	}
	@Test
	public void verifyCancelButtonTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelCheckout2(1,2); //Cancel
		String act=check2.verifyCancelButton();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Cancel Button "+ act);
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
