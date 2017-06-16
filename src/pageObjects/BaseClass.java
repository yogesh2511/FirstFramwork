package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver)
	{
		//this is the second commit!!
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
