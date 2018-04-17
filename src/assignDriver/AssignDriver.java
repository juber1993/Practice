package assignDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.WebDriverInit;

public class AssignDriver extends WebDriverInit
{
	@BeforeTest
	public void initDrivers()
	{

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get ("http://facebook.com");
	}
}
