package testCases;

import org.testng.annotations.Test;
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
import pages.Inventory_Page;
import pages.LoginPage;
import utility.CaptureScreenShot;
import utility.ReadData;

public class Inventory_Page_Test extends TestBase
{
	LoginPage login;
	Inventory_Page invent;
	

	@BeforeMethod
	public void setUp()throws Exception
	{
		initialization();
		login=new LoginPage();
		invent=new Inventory_Page();
		login.loginToApplication();
	}

	
	@Test
	public void verifyBurgerTest()
	{
		invent.verifyBurger();
		Reporter.log("Burger Menu Showing: "+ invent.verifyBurger());
	}
	
	@Test
	public void verifyappLogoTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,0);//Swag Labs(Sheet2,1,0)
		String act=invent.verifyappLogo();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("App Logo: "+ act);
	}
	
	@Test
	public void verifyCartLinkTest()
	{
		boolean cl=invent.verifyCartLink();
		Reporter.log("Cart Link Showing: "+ cl);
	}
	
	
	@Test
	public void verifyProductsLabelTest() throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,1);//Products(Sheet2,1,1);
		String act=invent.verifyProductsLabel();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product Label: "+ act);
	}
		
	@Test
	public void verifyProduct1Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,2);//Products(Sheet2,1,2);
		String act=invent.verifyProduct1();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 1: "+ act);
	}
	@Test
	public void verifyAddToCart1Test()
	{
		boolean act=invent.verifyAddToCart1();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 1: "+ act);
		
	}
	
	@Test
	public void verifyProduct2Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,3);//Products(Sheet2,1,3);
		String act=invent.verifyProduct2();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 2: "+ act);
	}
	@Test
	public void verifyAddToCart2Test()
	{
		boolean act=invent.verifyAddToCart2();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 2: "+ act);
		
	}
	@Test
	public void verifyProduct3Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,4);//Products(Sheet2,1,4);
		String act=invent.verifyProduct3();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 3: "+ act);
	}
	@Test
	public void verifyAddToCart3Test()
	{
		boolean act=invent.verifyAddToCart3();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 3: "+ act);
		
	}
	@Test
	public void verifyProduct4Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,5);//Products(Sheet2,1,5);
		String act=invent.verifyProduct4();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 4: "+ act);
	}
	public void verifyAddToCart4Test()
	{
		boolean act=invent.verifyAddToCart4();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 4: "+ act);
		
	}
	@Test
	public void verifyProduct5Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,6);//Products(Sheet2,1,6);
		String act=invent.verifyProduct5();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 5: "+ act);
	}
	@Test
	public void verifyAddToCart5Test()
	{
		boolean act=invent.verifyAddToCart5();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 5: "+ act);
		
	}
	@Test
	public void verifyProduct6Test()throws EncryptedDocumentException, IOException
	{
		String exp=ReadData.readExcelInventory(1,7);//Products(Sheet2,1,7);
		String act=invent.verifyProduct6();
		AssertJUnit.assertEquals(exp, act);
		Reporter.log("Product 6: "+ act);
	}
	@Test
	public void verifyAddToCart6Test()
	{
		boolean act=invent.verifyAddToCart6();
		AssertJUnit.assertEquals(act, true);
		Reporter.log("Add To Cart 6: "+ act);
		
	}
	
	@Test
	public void verifyIconTwitTest()
	{
		boolean twitter=invent.verifyIconTwit();
		AssertJUnit.assertEquals(twitter, true);
		Reporter.log("Twitter Icon Visibility: "+ twitter);
	}
	@Test
	public void verifyIconFaceTest()
	{
		boolean facebook=invent.verifyIconFace();
		AssertJUnit.assertEquals(facebook, true);
		Reporter.log("Facebook Icon Visibility: "+ facebook);
	}
	@Test
	public void verifyIconLinkdnTest()
	{
		boolean linkdn=invent.verifyIconLinkdn();
		AssertJUnit.assertEquals(linkdn, true);
		Reporter.log("Linkdin Icon Visibility: "+ linkdn);
	}
	@Test
	public void verifyCountProductsTest()throws EncryptedDocumentException, IOException
	{
		String expcount=ReadData.readExcelInventory(1,8);//Products(Sheet2,1,8);
		int expCount=Integer.parseInt(expcount);//Converting String To Integer
		int actCount=invent.verifyCountProducts();
		AssertJUnit.assertEquals(expCount, actCount);
		Reporter.log("Total Product Count On Page: "+ actCount);
	}
	@Test
	public void verifysortTabTest()
	{
		invent.verifysortTab();
		Reporter.log("Sort By Tab: "+ invent.verifysortTab());
	}
	
	@Test
	public void add6ProductsTest()throws Exception
	{
		String expCount=ReadData.readExcelInventory(1,9);//Adding 6P Carts(Sheet2,1,9);
		String actCount=invent.add6Products();
		AssertJUnit.assertEquals(expCount, actCount);
		Reporter.log("Total Products Added To Cart: "+ actCount);
		invent.verifyCartClick();
	}
	@Test
	public void remove2ProductTest()throws Exception
	{
		String expCount=ReadData.readExcelInventory(1,10);//Removing 2P Carts(Sheet2,1,10);
		String actCount=invent.remove2Products();
		AssertJUnit.assertEquals(expCount, actCount);
		Reporter.log("Total Products After Removing 2 Products: "+ actCount);
		invent.verifyCartClick();
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
