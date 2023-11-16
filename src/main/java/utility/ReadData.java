package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData 
{
 public static String readPropertyFile(String value)throws Exception
 {
	 Properties prop=new Properties();
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\config.properties");
	 prop.load(file);
	 return prop.getProperty(value);
 }
 public static String readExcelLogin(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Login");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
 public static String readExcelInventory(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Inventory");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
 public static String readExcelCart(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Cart");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
 public static String readExcelCheckout1(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Checkout1");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
 public static String readExcelCheckout2(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Checkout2");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
 public static String readExcelCompleteCheckout(int row,int col) throws EncryptedDocumentException, IOException
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\ankit\\Downloads\\Vivek_Testing-master\\Vivek_Testing-master\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("CheckoutComplete");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 return value;
 }
}
