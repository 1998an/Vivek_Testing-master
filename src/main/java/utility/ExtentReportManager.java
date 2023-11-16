package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.converters.ExtentHtmlReporterConverter;

import base.TestBase;

public class ExtentReportManager extends TestBase
{
	static ExtentReports report;
	public static ExtentReports getReportInstance()
	{
		if(report==null)
		{
			String reportName=new SimpleDateFormat("dd-MM-YYYY ss-mm-HH").format(new Date());
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\ExtentReport"+reportName+".html");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Environment","SIT");
		report.setSystemInfo("Build","102.02.02.123");
		report.setSystemInfo("Browser","Chrome");
		htmlReporter.config().setDocumentTitle("UI Testing Document");
		htmlReporter.config().setReportName("UI Testing Report");
		}
		return report;
	}
	
}
