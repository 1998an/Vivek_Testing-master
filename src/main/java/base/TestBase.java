package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.*;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ExtentReportManager;
import utility.ReadData;

public class TestBase 
{                   //extent reports contains two major classes 1.extentreport class   2.extents class
	public ExtentReports report=ExtentReportManager.getReportInstance();
	public ExtentTest logger; //logs test steps into the previously generated html report
	public static WebDriver driver; 
	
	public void initialization()throws Exception
	{
		String browser=ReadData.readPropertyFile("Browser");
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(ReadData.readPropertyFile("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
