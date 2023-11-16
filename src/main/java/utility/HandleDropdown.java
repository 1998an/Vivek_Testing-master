package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown
{
	public static void handleSelectClass(WebElement we,String value)
	{
		Select sel=new Select(we);
		sel.selectByVisibleText("Name (Z to A)");
	}

}
