package Salesforce_Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC13 {
	public static void main(String[] args) throws InterruptedException
	{
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
		
		driver.findElement(By.partialLinkText("Merge Accounts")).click();
		System.out.println("Merge account page is displayed");
		driver.findElement(By.id("srch")).sendKeys("test");
		driver.findElement(By.name("srchbutton")).click();
		
		if(!driver.findElement(By.id("cid0")).isEnabled()) {
		driver.findElement(By.id("cid0")).click();		
		}
		
		if(!driver.findElement(By.id("cid1")).isEnabled()) {
		driver.findElement(By.id("cid1")).click();	
		}
		Thread.sleep(5000);

		System.out.println("first two accounts is selected");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[contains(@name, 'goNext')]")).click();		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='save']")).click();
		System.out.println(" two accounts is Merged");
		
		
		Alert alert=driver.switchTo().alert();;
		alert.accept();


	}

}
