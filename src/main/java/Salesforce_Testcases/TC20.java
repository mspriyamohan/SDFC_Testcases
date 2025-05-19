package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC20 {
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
		
		WebElement leadlink=driver.findElement(By.id("Lead_Tab"));
		if(!leadlink.isDisplayed())
		{
			System.out.println("Lead Tab is not present");	
		}
        
	     	System.out.println("Lead Tab is present");
	     	leadlink.click();
	     	
	     driver.findElement(By.id("userNav-arrow")).click();
         driver.findElement(By.xpath("//*[@href='/secur/logout.jsp']")).click();
         System.out.println("Application got logout successfully");
	   	driver.close();
	}
         
}
