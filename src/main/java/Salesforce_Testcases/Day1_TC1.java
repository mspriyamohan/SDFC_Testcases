package Salesforce_Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_TC1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		driver.findElementsByName("pw").clear();
		driver.findElementById("Login").click();
		String error=driver.findElementById("error").getText();
		Thread.sleep(5000);
		System.out.println(error);
		/*driver.close();		*/
	}

}
