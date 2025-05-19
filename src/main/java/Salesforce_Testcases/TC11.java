package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11 {
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
	
	driver.findElement(By.linkText("Create New View")).click();
	WebElement viewname=driver.findElement(By.id("fname"));
	viewname.clear();
	viewname.sendKeys("test4");
	System.out.println("viewname is entered");
	Thread.sleep(5000);

	WebElement uniquename=driver.findElement(By.id("devname"));
	uniquename.clear();
	uniquename.sendKeys("selenium3");
	Thread.sleep(2000);
	System.out.println("uniquename is entered");
	driver.findElement(By.name("save")).click();
	Thread.sleep(2000);
	System.out.println("Newely added View is displayed in the account view list");
	Thread.sleep(5000);

	
	driver.close();
	}

}
