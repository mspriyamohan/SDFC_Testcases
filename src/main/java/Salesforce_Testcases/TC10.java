package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC10 {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://login.salesforce.com/");
	WebElement login=driver.findElementByName("username");
	login.clear();
	login.sendKeys("mspriyamohan106@agentforce.com");
	WebElement password=driver.findElementById("password");
	password.sendKeys("1GlaksAd!");
	driver.findElementById("Login").click();
	System.out.println("Home page is displayed");
	Thread.sleep(5000);

	driver.findElement(By.id("Account_Tab")).click();
	System.out.println("Accounts page is displayed with correct <username>");
	Thread.sleep(5000);

	driver.findElement(By.xpath("//*[@value=\" New \"]")).click();
	driver.findElement(By.id("acc2")).sendKeys("Test");
	WebElement dropdown=driver.findElement(By.id("acc6"));
	Thread.sleep(5000);

	Select options=new Select(dropdown);
	options.selectByValue("Technology Partner");
	
	Thread.sleep(5000);

	WebElement priority=driver.findElement(By.id("00NgL00000JVZcs"));
	Select option=new Select(priority);
	option.selectByValue("High");
	System.out.println("New account page is displayed with account details.");
	
	driver.close();
	
	

}
}
