package mainPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import assignDriver.AssignDriver;
import values.Values;
import xPathLocators.XpathLocators;

public class MainClass extends AssignDriver
{
XpathLocators loc=new XpathLocators();
Values val=new Values();

@Test
public void testingEmail()
{
//	//Testing email
//	typeByXpath(loc.email, val.emailval);
//	//Testing Password 
//	typeByXpath(loc.password, val.passval);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("juber1993@aol.com");
	driver.findElement(By.xpath("//inout[@id='pass']")).sendKeys("123456");
	
}

}
