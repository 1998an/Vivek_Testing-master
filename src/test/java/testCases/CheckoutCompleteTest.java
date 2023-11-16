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
import pages.CheckoutComplete;
import pages.Inventory_Page;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class CheckoutCompleteTest extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	CartPage cart;
	Checkout1 check1;
	Checkout2 check2;
	CheckoutComplete check3;
	
	

	@BeforeMethod(alwaysRun = true)
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		cart=new CartPage();
		check1=new Checkout1();
		check2=new Checkout2();
		check3=new CheckoutComplete();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartClick();
		cart.verifyCheckout();
		check1.verifyCheckout1();
		check2.verifyFinishButton();
	}
	@Test
	public void verifyURLOfCheckoutCompleteTest()throws Exception
	{
		String exp=ReadData.readExcelCompleteCheckout(1,1); //urlcheckout3
		String act=check3.verifyURLOfCheckoutComplete();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("URL of Chcekout 3 "+ act);
	}
	@Test
	public void verifyTitleOfCheckoutCompleteTest()throws Exception
	{
		String exp=ReadData.readExcelCompleteCheckout(1,0); //Title3
		String act=check3.verifyTitleOfCheckoutComplete();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Title of Checkout 3 "+ act);
	}
	@Test
	public void verifyImageTest()
	{
		boolean logo=check3.verifyImage();
		AssertJUnit.assertEquals(logo, true);
		Reporter.log("Final Logo Visibility: "+ logo);
	}
	@Test
	public void verifyHeaderTest()throws Exception
	{
		String exp=ReadData.readExcelCompleteCheckout(1,2); //Title
		String act=check3.verifyHeader();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Header: "+ act);
	}
	@Test
	public void verifyHeaderTextTest()throws Exception
	{
		String exp=ReadData.readExcelCompleteCheckout(1,3); //Title
		String act=check3.verifyHeaderText();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Header Text: "+ act);
	}
	@Test(enabled = true,groups={"retest", "sanity"})
	public void verifybackHomeTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelCompleteCheckout(1,4); //backbutton
		String act=check3.verifybackHome();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("After Clicking on Back Home Button: "+ act);
		
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
